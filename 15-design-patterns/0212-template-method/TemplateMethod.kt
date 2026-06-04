abstract class Algorithm {
    protected abstract fun step(): String

    fun run(): String = "start ${step()} end"
}

class WorkAlgorithm : Algorithm() {
    override fun step() = "work"
}

fun main() {
    println(WorkAlgorithm().run())
}
