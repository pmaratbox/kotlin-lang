class Node(val value: Int) {
    var left: Node? = null
    var right: Node? = null
}

fun insert(root: Node?, value: Int): Node {
    if (root == null) return Node(value)
    if (value < root.value) root.left = insert(root.left, value)
    else root.right = insert(root.right, value)
    return root
}

fun inorder(root: Node?, out: MutableList<Int>) {
    if (root == null) return
    inorder(root.left, out)
    out.add(root.value)
    inorder(root.right, out)
}

fun main() {
    var root: Node? = null
    for (v in listOf(5, 3, 8, 1, 4)) root = insert(root, v)
    val out = mutableListOf<Int>()
    inorder(root, out)
    println(out.joinToString(" "))
}
