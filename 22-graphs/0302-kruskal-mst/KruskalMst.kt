class UnionFind(n: Int) {
    private val parent = IntArray(n) { it }

    fun find(x: Int): Int {
        if (parent[x] != x) parent[x] = find(parent[x])
        return parent[x]
    }

    fun union(a: Int, b: Int): Boolean {
        val ra = find(a)
        val rb = find(b)
        if (ra == rb) return false
        parent[ra] = rb
        return true
    }
}

fun main() {
    val edges = listOf(Triple(0, 1, 1), Triple(1, 2, 2), Triple(0, 2, 3))
    val uf = UnionFind(3)
    var total = 0
    for ((u, v, w) in edges.sortedBy { it.third }) {
        if (uf.union(u, v)) total += w
    }
    println(total)
}
