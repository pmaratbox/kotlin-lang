class MinStack {
    private val stack = ArrayDeque<Int>()
    private val mins = ArrayDeque<Int>()

    fun push(value: Int) {
        stack.addLast(value)
        mins.addLast(if (mins.isEmpty()) value else minOf(value, mins.last()))
    }

    fun getMin(): Int = mins.last()
}

fun main() {
    val s = MinStack()
    for (v in listOf(3, 1, 2)) s.push(v)
    println("min: ${s.getMin()}")
}
