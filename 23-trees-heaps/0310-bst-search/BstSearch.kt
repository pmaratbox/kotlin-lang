class Node(val v: Int, var left: Node? = null, var right: Node? = null)

fun insert(root: Node?, v: Int): Node {
    if (root == null) return Node(v)
    if (v < root.v) root.left = insert(root.left, v)
    else if (v > root.v) root.right = insert(root.right, v)
    return root
}

fun search(root: Node?, key: Int): Boolean {
    var cur = root
    while (cur != null) {
        cur = when {
            key == cur.v -> return true
            key < cur.v -> cur.left
            else -> cur.right
        }
    }
    return false
}

fun main() {
    var root: Node? = null
    for (x in listOf(5, 3, 8, 1, 4)) root = insert(root, x)
    val a = if (search(root, 4)) "yes" else "no"
    val b = if (search(root, 6)) "yes" else "no"
    println("$a $b")
}
