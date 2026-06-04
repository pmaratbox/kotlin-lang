class CircularQueue(private val capacity: Int) {
    private val data = IntArray(capacity)
    private var head = 0
    private var size = 0

    fun enqueue(value: Int) {
        require(size < capacity) { "queue full" }
        data[(head + size) % capacity] = value
        size++
    }

    fun dequeue(): Int {
        require(size > 0) { "queue empty" }
        val value = data[head]
        head = (head + 1) % capacity
        size--
        return value
    }

    fun contents(): List<Int> = (0 until size).map { data[(head + it) % capacity] }
}

fun main() {
    val queue = CircularQueue(3)
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.dequeue()
    queue.enqueue(4)
    println(queue.contents().joinToString(" "))
}
