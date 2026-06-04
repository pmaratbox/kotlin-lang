fun main() {
    val n = 5
    val adj = Array(n) { mutableListOf<Int>() }
    listOf(0 to 1, 1 to 2, 3 to 4).forEach { (u, v) ->
        adj[u].add(v)
        adj[v].add(u)
    }

    val seen = BooleanArray(n)

    fun dfs(u: Int) {
        seen[u] = true
        for (v in adj[u]) if (!seen[v]) dfs(v)
    }

    var count = 0
    for (v in 0 until n) {
        if (!seen[v]) {
            count++
            dfs(v)
        }
    }
    println(count)
}
