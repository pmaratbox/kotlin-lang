import java.util.PriorityQueue

fun main() {
    val n = 4
    val adj = Array(n) { mutableListOf<Pair<Int, Int>>() }
    listOf(Triple(0, 1, 4), Triple(0, 2, 1), Triple(2, 1, 2), Triple(1, 3, 1), Triple(2, 3, 5))
        .forEach { (u, v, w) -> adj[u].add(v to w) }

    val dist = IntArray(n) { Int.MAX_VALUE }
    dist[0] = 0
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
    pq.add(0 to 0)
    while (pq.isNotEmpty()) {
        val (u, d) = pq.poll()
        if (d > dist[u]) continue
        for ((v, w) in adj[u]) {
            if (dist[u] + w < dist[v]) {
                dist[v] = dist[u] + w
                pq.add(v to dist[v])
            }
        }
    }
    println(dist.joinToString(" "))
}
