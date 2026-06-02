fun isBalanced(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    for (ch in s) {
        if (ch == '(') {
            stack.addLast(ch)
        } else if (ch == ')') {
            if (stack.isEmpty()) return false
            stack.removeLast()
        }
    }
    return stack.isEmpty()
}

fun main() {
    for (s in listOf("(())", "(()")) {
        println(if (isBalanced(s)) "yes" else "no")
    }
}
