fun parity(n: Int): Int = n.countOneBits() and 1

fun main() {
    println("${parity(7)} ${parity(5)}")
}
