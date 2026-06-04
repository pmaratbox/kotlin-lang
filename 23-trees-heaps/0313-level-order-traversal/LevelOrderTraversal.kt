import java.util.ArrayDeque

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
    val queue = ArrayDeque<Node>()
    root?.let { queue.add(it) }
    while (queue.isNotEmpty()) {
        val n = queue.poll()
        out.add(n.v)
        n.left?.let { queue.add(it) }
        n.right?.let { queue.add(it) }
    }
    println(out.joinToString(" "))
}
