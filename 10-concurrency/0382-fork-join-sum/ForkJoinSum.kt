import java.util.concurrent.RecursiveTask
import java.util.concurrent.ForkJoinPool

class SumTask(private val range: IntRange) : RecursiveTask<Int>() {
    override fun compute(): Int {
        if (range.first == range.last) return range.first
        val mid = (range.first + range.last) / 2
        val left = SumTask(range.first..mid)
        val right = SumTask((mid + 1)..range.last)
        left.fork()
        val rightResult = right.compute()
        return left.join() + rightResult
    }
}

fun main() {
    val sum = ForkJoinPool.commonPool().invoke(SumTask(1..8))
    println(sum)
}
