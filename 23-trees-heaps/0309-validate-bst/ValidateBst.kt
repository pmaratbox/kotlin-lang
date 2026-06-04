class Node(val v: Int, var left: Node? = null, var right: Node? = null)

fun isValid(node: Node?, low: Long, high: Long): Boolean {
    if (node == null) return true
    if (node.v <= low || node.v >= high) return false
    return isValid(node.left, low, node.v.toLong()) &&
        isValid(node.right, node.v.toLong(), high)
}

fun main() {
    val good = Node(5, Node(3, Node(1), Node(4)), Node(8))
    val bad = Node(5, Node(3, Node(1), Node(6)), Node(8))
    val a = if (isValid(good, Long.MIN_VALUE, Long.MAX_VALUE)) "yes" else "no"
    val b = if (isValid(bad, Long.MIN_VALUE, Long.MAX_VALUE)) "yes" else "no"
    println("$a $b")
}
