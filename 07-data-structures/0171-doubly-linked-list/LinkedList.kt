class Node(val value: Int) {
    var prev: Node? = null
    var next: Node? = null
}

fun main() {
    val n1 = Node(1)
    val n2 = Node(2)
    val n3 = Node(3)
    n1.next = n2; n2.prev = n1
    n2.next = n3; n3.prev = n2

    val forward = StringBuilder()
    var cur: Node? = n1
    while (cur != null) {
        forward.append(cur.value)
        if (cur.next != null) forward.append(' ')
        cur = cur.next
    }
    println(forward)

    val backward = StringBuilder()
    cur = n3
    while (cur != null) {
        backward.append(cur.value)
        if (cur.prev != null) backward.append(' ')
        cur = cur.prev
    }
    println(backward)
}
