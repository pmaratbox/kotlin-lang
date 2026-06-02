fun <T : Comparable<T>> largest(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {
    println(largest(3, 9))
    println(largest("apple", "pear"))
}
