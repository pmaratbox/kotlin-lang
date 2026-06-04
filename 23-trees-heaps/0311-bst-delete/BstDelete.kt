class Node(val v: Int, var left: Node? = null, var right: Node? = null)

fun insert(root: Node?, v: Int): Node {
    if (root == null) return Node(v)
    if (v < root.v) root.left = insert(root.left, v)
    else if (v > root.v) root.right = insert(root.right, v)
    return root
}

fun minNode(node: Node): Node {
    var cur = node
    while (cur.left != null) cur = cur.left!!
    return cur
}

fun delete(root: Node?, key: Int): Node? {
    if (root == null) return null
    when {
        key < root.v -> root.left = delete(root.left, key)
        key > root.v -> root.right = delete(root.right, key)
        else -> {
            if (root.left == null) return root.right
            if (root.right == null) return root.left
            val succ = minNode(root.right!!)
            val replaced = Node(succ.v, root.left, delete(root.right, succ.v))
            return replaced
        }
    }
    return root
}

fun inorder(node: Node?, out: MutableList<Int>) {
    if (node == null) return
    inorder(node.left, out)
    out.add(node.v)
    inorder(node.right, out)
}

fun main() {
    var root: Node? = null
    for (x in listOf(5, 3, 8, 1, 4)) root = insert(root, x)
    root = delete(root, 3)
    val out = mutableListOf<Int>()
    inorder(root, out)
    println(out.joinToString(" "))
}
