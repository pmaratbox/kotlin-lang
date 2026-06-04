import java.util.ArrayDeque

fun isBipartite(n: Int, edges: List<Pair<Int, Int>>): Boolean {
    val adj = Array(n) { mutableListOf<Int>() }
    edges.forEach { (u, v) ->
        adj[u].add(v)
        adj[v].add(u)
    }
    val color = IntArray(n) { -1 }
    for (start in 0 until n) {
        if (color[start] != -1) continue
        color[start] = 0
        val queue = ArrayDeque<Int>()
        queue.add(start)
        while (queue.isNotEmpty()) {
            val u = queue.poll()
            for (v in adj[u]) {
                if (color[v] == -1) {
                    color[v] = color[u] xor 1
                    queue.add(v)
                } else if (color[v] == color[u]) {
                    return false
                }
            }
        }
    }
    return true
}

fun main() {
    val cycle4 = isBipartite(4, listOf(0 to 1, 1 to 2, 2 to 3, 3 to 0))
    val triangle = isBipartite(3, listOf(0 to 1, 1 to 2, 2 to 0))
    println("${if (cycle4) "yes" else "no"} ${if (triangle) "yes" else "no"}")
}
