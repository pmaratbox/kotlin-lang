fun main() {
    val n = 3
    val edges = listOf(Triple(0, 1, 1), Triple(1, 2, -2), Triple(0, 2, 4))
    val dist = IntArray(n) { Int.MAX_VALUE }
    dist[0] = 0
    repeat(n - 1) {
        for ((u, v, w) in edges) {
            if (dist[u] != Int.MAX_VALUE && dist[u] + w < dist[v]) {
                dist[v] = dist[u] + w
            }
        }
    }
    println(dist.joinToString(" "))
}
