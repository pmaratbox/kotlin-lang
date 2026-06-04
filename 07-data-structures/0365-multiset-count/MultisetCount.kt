class Multiset<T> {
    private val counts = HashMap<T, Int>()

    fun add(element: T) {
        counts[element] = (counts[element] ?: 0) + 1
    }

    fun remove(element: T) {
        val current = counts[element] ?: return
        if (current <= 1) counts.remove(element) else counts[element] = current - 1
    }

    fun count(element: T): Int = counts[element] ?: 0
}

fun main() {
    val multiset = Multiset<Int>()
    multiset.add(1)
    multiset.add(1)
    multiset.add(2)
    val before = multiset.count(1)
    multiset.remove(1)
    val after = multiset.count(1)
    println("$before $after")
}
