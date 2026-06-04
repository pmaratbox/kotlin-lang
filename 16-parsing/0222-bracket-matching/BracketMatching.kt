fun balanced(s: String): Boolean {
    val pairs = mapOf(')' to '(', ']' to '[', '}' to '{')
    val stack = ArrayDeque<Char>()
    for (c in s) {
        when (c) {
            '(', '[', '{' -> stack.addLast(c)
            ')', ']', '}' -> if (stack.removeLastOrNull() != pairs[c]) return false
        }
    }
    return stack.isEmpty()
}

fun main() {
    val a = if (balanced("([{}])")) "yes" else "no"
    val b = if (balanced("([)]")) "yes" else "no"
    println("$a $b")
}
