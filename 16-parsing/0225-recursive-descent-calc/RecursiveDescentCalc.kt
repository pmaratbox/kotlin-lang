class Parser(private val src: String) {
    private var pos = 0

    fun parse(): Int = expr()

    private fun expr(): Int {
        var value = term()
        while (pos < src.length && src[pos] == '+') {
            pos++
            value += term()
        }
        return value
    }

    private fun term(): Int {
        var value = factor()
        while (pos < src.length && src[pos] == '*') {
            pos++
            value *= factor()
        }
        return value
    }

    private fun factor(): Int {
        val start = pos
        while (pos < src.length && src[pos].isDigit()) pos++
        return src.substring(start, pos).toInt()
    }
}

fun main() {
    println(Parser("2+3*4").parse())
}
