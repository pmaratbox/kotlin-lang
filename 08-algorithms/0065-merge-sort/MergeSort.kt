fun merge(left: List<Int>, right: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    var i = 0
    var j = 0
    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) result.add(left[i++])
        else result.add(right[j++])
    }
    while (i < left.size) result.add(left[i++])
    while (j < right.size) result.add(right[j++])
    return result
}

fun mergeSort(items: List<Int>): List<Int> {
    if (items.size <= 1) return items
    val mid = items.size / 2
    return merge(mergeSort(items.subList(0, mid)), mergeSort(items.subList(mid, items.size)))
}

fun main() {
    val data = listOf(3, 1, 4, 1, 5, 2)
    println(mergeSort(data).joinToString(" "))
}
