class Node(val v: Int, var left: Node? = null, var right: Node? = null)

fun insert(root: Node?, v: Int): Node {
    if (root == null) return Node(v)
    if (v < root.v) root.left = insert(root.left, v)
    else if (v > root.v) root.right = insert(root.right, v)
    return root
}

fun height(node: Node?): Int =
    if (node == null) 0 else 1 + maxOf(height(node.left), height(node.right))

fun main() {
    var root: Node? = null
    for (x in listOf(5, 3, 8, 1, 4)) root = insert(root, x)
    println(height(root))
}
