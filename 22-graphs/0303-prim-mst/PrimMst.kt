import java.util.PriorityQueue

fun main() {
    val n = 4
    val adj = Array(n) { mutableListOf<Pair<Int, Int>>() }
    listOf(Triple(0, 1, 1), Triple(1, 2, 2), Triple(2, 3, 3)).forEach { (u, v, w) ->
        adj[u].add(v to w)
        adj[v].add(u to w)
    }

    val inTree = BooleanArray(n)
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second }) // (node, weight)
    pq.add(0 to 0)
    var total = 0
    while (pq.isNotEmpty()) {
        val (u, w) = pq.poll()
        if (inTree[u]) continue
        inTree[u] = true
        total += w
        for ((v, ew) in adj[u]) if (!inTree[v]) pq.add(v to ew)
    }
    println(total)
}
