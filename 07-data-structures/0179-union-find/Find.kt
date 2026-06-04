class UnionFind(n: Int) {
    private val parent = IntArray(n) { it }

    fun find(x: Int): Int {
        if (parent[x] != x) parent[x] = find(parent[x])
        return parent[x]
    }

    fun union(a: Int, b: Int) {
        parent[find(a)] = find(b)
    }

    fun connected(a: Int, b: Int): Boolean = find(a) == find(b)
}

fun main() {
    val uf = UnionFind(4)
    uf.union(0, 1)
    uf.union(2, 3)
    val q1 = if (uf.connected(0, 1)) "yes" else "no"
    val q2 = if (uf.connected(0, 2)) "yes" else "no"
    println("$q1 $q2")
}
