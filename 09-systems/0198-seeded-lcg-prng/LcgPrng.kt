fun main() {
    var x = 1
    val out = StringBuilder()
    repeat(3) {
        x = (5 * x + 3) % 16
        if (out.isNotEmpty()) out.append(' ')
        out.append(x)
    }
    println(out)
}
