fun add(a: Int, b: Int): Int = a + b

fun main() {
    val addTen: (Int) -> Int = { b -> add(10, b) }
    println(addTen(3))
}
