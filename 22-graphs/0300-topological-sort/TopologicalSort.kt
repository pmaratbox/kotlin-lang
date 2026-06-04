import java.util.PriorityQueue

fun main() {
    val n = 4
    val adj = Array(n) { mutableListOf<Int>() }
    val indeg = IntArray(n)
    listOf(0 to 1, 0 to 2, 1 to 3, 2 to 3).forEach { (u, v) ->
        adj[u].add(v)
        indeg[v]++
    }

    val pq = PriorityQueue<Int>()
    for (v in 0 until n) if (indeg[v] == 0) pq.add(v)

    val order = mutableListOf<Int>()
    while (pq.isNotEmpty()) {
        val u = pq.poll()
        order.add(u)
        for (v in adj[u]) if (--indeg[v] == 0) pq.add(v)
    }
    println(order.joinToString(" "))
}
