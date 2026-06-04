class RingBuffer(private val capacity: Int) {
    private val data = IntArray(capacity)
    private var head = 0
    private var size = 0

    fun push(value: Int) {
        val tail = (head + size) % capacity
        data[tail] = value
        if (size < capacity) size++ else head = (head + 1) % capacity
    }

    fun contents(): List<Int> = (0 until size).map { data[(head + it) % capacity] }
}

fun main() {
    val rb = RingBuffer(3)
    for (v in listOf(1, 2, 3, 4, 5)) rb.push(v)
    println(rb.contents().joinToString(" "))
}
