fun main() {
    val n = 3
    val inf = Int.MAX_VALUE / 2
    val dist = Array(n) { i -> IntArray(n) { j -> if (i == j) 0 else inf } }
    listOf(Triple(0, 1, 3), Triple(1, 2, 1), Triple(0, 2, 5))
        .forEach { (u, v, w) -> dist[u][v] = w }

    for (k in 0 until n)
        for (i in 0 until n)
            for (j in 0 until n)
                if (dist[i][k] + dist[k][j] < dist[i][j])
                    dist[i][j] = dist[i][k] + dist[k][j]

    println(dist[0][2])
}
