import kotlin.reflect.full.primaryConstructor

data class Point(val x: Int, val y: Int)

fun main() {
    val names = Point::class.primaryConstructor!!.parameters.map { it.name }
    println(names.joinToString(" "))
}
