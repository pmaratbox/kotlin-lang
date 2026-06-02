import java.util.PriorityQueue

fun main() {
    val pq = PriorityQueue<Int>()
    for (n in listOf(3, 1, 2)) {
        pq.add(n)
    }

    val out = mutableListOf<String>()
    while (pq.isNotEmpty()) {
        out.add(pq.poll().toString())
    }
    println(out.joinToString(" "))
}
