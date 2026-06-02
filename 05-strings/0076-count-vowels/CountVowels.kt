fun main() {
    val word = "hello"
    val count = word.count { it in "aeiou" }
    println(count)
}
