fun horner(coeffs: List<Int>, x: Int): Int = coeffs.fold(0) { acc, c -> acc * x + c }

fun main() {
    // 2x^2 + 3x + 1 at x = 2
    println(horner(listOf(2, 3, 1), 2))
}
