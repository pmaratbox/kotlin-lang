fun main() {
    val prec = mapOf("+" to 1, "*" to 2)
    val output = mutableListOf<String>()
    val ops = ArrayDeque<String>()
    for (tok in "3 + 4 * 2".split(" ")) {
        if (tok in prec) {
            while (ops.isNotEmpty() && prec.getValue(ops.last()) >= prec.getValue(tok)) {
                output.add(ops.removeLast())
            }
            ops.addLast(tok)
        } else {
            output.add(tok)
        }
    }
    while (ops.isNotEmpty()) output.add(ops.removeLast())
    println(output.joinToString(" "))
}
