fun main() {
    val expr = "3 4 + 5 *"
    val stack = ArrayDeque<Int>()
    for (tok in expr.split(" ")) {
        when (tok) {
            "+" -> { val b = stack.removeLast(); val a = stack.removeLast(); stack.addLast(a + b) }
            "*" -> { val b = stack.removeLast(); val a = stack.removeLast(); stack.addLast(a * b) }
            else -> stack.addLast(tok.toInt())
        }
    }
    println(stack.last())
}
