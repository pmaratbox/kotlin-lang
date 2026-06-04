class Node(val v: Int, var left: Node? = null, var right: Node? = null)

fun insert(root: Node?, v: Int): Node {
    if (root == null) return Node(v)
    if (v < root.v) root.left = insert(root.left, v)
    else if (v > root.v) root.right = insert(root.right, v)
    return root
}

fun main() {
    var root: Node? = null
    for (x in listOf(5, 3, 8, 1, 4)) root = insert(root, x)
    val out = mutableListOf<Int>()
    val stack = ArrayDeque<Node>()
    root?.let { stack.addLast(it) }
    while (stack.isNotEmpty()) {
        val n = stack.removeLast()
        out.add(n.v)
        n.right?.let { stack.addLast(it) }
        n.left?.let { stack.addLast(it) }
    }
    println(out.joinToString(" "))
}
