fun add(a: Int): (Int) -> Int = { b -> a + b }

fun main() {
    println(add(2)(3))
}
