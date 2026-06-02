fun quicksort(items: List<Int>): List<Int> {
    if (items.size <= 1) return items
    val pivot = items[0]
    val rest = items.drop(1)
    val less = rest.filter { it < pivot }
    val greater = rest.filter { it >= pivot }
    return quicksort(less) + pivot + quicksort(greater)
}

fun main() {
    val data = listOf(3, 1, 4, 1, 5, 2)
    println(quicksort(data).joinToString(" "))
}
