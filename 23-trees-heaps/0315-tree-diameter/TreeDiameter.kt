class Node(val name: String, var left: Node? = null, var right: Node? = null)

var best = 0

fun height(node: Node?): Int {
    if (node == null) return 0
    val l = height(node.left)
    val r = height(node.right)
    best = maxOf(best, l + r)
    return 1 + maxOf(l, r)
}

fun main() {
    val c = Node("C")
    val d = Node("D")
    val a = Node("A", c, d)
    val b = Node("B")
    val root = Node("root", a, b)
    height(root)
    println(best)
}
