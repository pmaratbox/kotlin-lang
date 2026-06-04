class RangeIterator(private val end: Int) : Iterator<Int> {
    private var current = 1

    override fun hasNext() = current <= end

    override fun next() = current++
}

fun main() {
    val it = RangeIterator(3)
    val values = mutableListOf<Int>()
    while (it.hasNext()) {
        values.add(it.next())
    }
    println(values.joinToString(" "))
}
