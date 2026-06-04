fun main() {
    val n = 4
    val adj = Array(n) { mutableListOf<Int>() }
    val radj = Array(n) { mutableListOf<Int>() }
    listOf(0 to 1, 1 to 2, 2 to 0, 2 to 3).forEach { (u, v) ->
        adj[u].add(v)
        radj[v].add(u)
    }

    val seen = BooleanArray(n)
    val order = mutableListOf<Int>()

    fun dfs1(u: Int) {
        seen[u] = true
        for (v in adj[u]) if (!seen[v]) dfs1(v)
        order.add(u)
    }
    for (v in 0 until n) if (!seen[v]) dfs1(v)

    val comp = IntArray(n) { -1 }
    fun dfs2(u: Int, c: Int) {
        comp[u] = c
        for (v in radj[u]) if (comp[v] == -1) dfs2(v, c)
    }

    var count = 0
    for (u in order.reversed()) {
        if (comp[u] == -1) {
            dfs2(u, count)
            count++
        }
    }
    println(count)
}
