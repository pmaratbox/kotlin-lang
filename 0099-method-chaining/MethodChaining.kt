class Calc(var value: Int) {
    fun add(n: Int): Calc {
        value += n
        return this
    }

    fun multiply(n: Int): Calc {
        value *= n
        return this
    }
}

fun main() {
    val c = Calc(5).add(3).multiply(2)
    println(c.value)
}
