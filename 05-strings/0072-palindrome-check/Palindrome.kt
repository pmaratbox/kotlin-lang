fun isPalindrome(s: String) = s == s.reversed()

fun main() {
    for (word in listOf("level", "hello")) {
        println("$word: ${if (isPalindrome(word)) "yes" else "no"}")
    }
}
