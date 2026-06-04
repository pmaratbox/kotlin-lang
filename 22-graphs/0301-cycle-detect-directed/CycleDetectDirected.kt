fun main() {
    val n = 3
    val adj = Array(n) { mutableListOf<Int>() }
    listOf(0 to 1, 1 to 2, 2 to 0).forEach { (u, v) -> adj[u].add(v) }

    val color = IntArray(n) // 0=white, 1=gray, 2=black

    fun dfs(u: Int): Boolean {
        color[u] = 1
        for (v in adj[u]) {
            if (color[v] == 1) return true
            if (color[v] == 0 && dfs(v)) return true
        }
        color[u] = 2
        return false
    }

    val hasCycle = (0 until n).any { color[it] == 0 && dfs(it) }
    println(if (hasCycle) "cycle" else "acyclic")
}
