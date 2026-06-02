fun anagram(a: String, b: String) = a.toCharArray().sorted() == b.toCharArray().sorted()

fun main() {
    val pairs = listOf("listen" to "silent", "hello" to "world")
    for ((a, b) in pairs) {
        println("$a/$b: ${if (anagram(a, b)) "yes" else "no"}")
    }
}
