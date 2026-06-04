import java.util.PriorityQueue

fun main() {
    val k = 2
    val nums = listOf(3, 2, 1, 5, 6, 4)
    val heap = PriorityQueue<Int>()
    for (x in nums) {
        heap.add(x)
        if (heap.size > k) heap.poll()
    }
    println(heap.peek())
}
