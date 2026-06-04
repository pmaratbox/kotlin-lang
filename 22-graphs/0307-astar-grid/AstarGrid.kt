import java.util.PriorityQueue
import kotlin.math.abs

fun main() {
    val rows = 3
    val cols = 3
    val goal = 2 to 2

    fun h(r: Int, c: Int) = abs(r - goal.first) + abs(c - goal.second)

    val g = Array(rows) { IntArray(cols) { Int.MAX_VALUE } }
    g[0][0] = 0
    // (f, r, c)
    val pq = PriorityQueue<Triple<Int, Int, Int>>(compareBy { it.first })
    pq.add(Triple(h(0, 0), 0, 0))
    val dirs = listOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    while (pq.isNotEmpty()) {
        val (_, r, c) = pq.poll()
        if (r to c == goal) {
            println(g[r][c])
            return
        }
        for ((dr, dc) in dirs) {
            val nr = r + dr
            val nc = c + dc
            if (nr in 0 until rows && nc in 0 until cols && g[r][c] + 1 < g[nr][nc]) {
                g[nr][nc] = g[r][c] + 1
                pq.add(Triple(g[nr][nc] + h(nr, nc), nr, nc))
            }
        }
    }
}
