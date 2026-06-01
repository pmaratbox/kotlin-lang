fun main() {
    val stack = ArrayDeque<Int>()
    for (n in 1..3) {
        stack.addLast(n)
    }

    val popped = mutableListOf<Int>()
    while (stack.isNotEmpty()) {
        popped.add(stack.removeLast())
    }

    println(popped.joinToString(" "))
}
