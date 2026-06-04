import java.util.PriorityQueue

fun main() {
    val heap = PriorityQueue<Int>(reverseOrder())
    heap.addAll(listOf(3, 1, 4, 1, 5))
    val out = (1..3).map { heap.poll() }
    println(out.joinToString(" "))
}
