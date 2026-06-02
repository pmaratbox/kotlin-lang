class Node(val value: Int, val next: Node? = null)

fun main() {
    val head = Node(1, Node(2, Node(3)))

    val parts = mutableListOf<String>()
    var node: Node? = head
    while (node != null) {
        parts.add(node.value.toString())
        node = node.next
    }
    println(parts.joinToString(" -> "))
}
