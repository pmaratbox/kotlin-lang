fun main() {
    val deque = ArrayDeque<Int>()
    deque.addLast(1)
    deque.addLast(2)
    deque.addFirst(0)
    println(deque.joinToString(" "))
}
