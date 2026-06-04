fun main() {
    val stack = ArrayDeque<Int>()
    for (i in 1..3) stack.addLast(i)
    val out = StringBuilder()
    while (stack.isNotEmpty()) {
        if (out.isNotEmpty()) out.append(' ')
        out.append(stack.removeLast())
    }
    println(out)
}
