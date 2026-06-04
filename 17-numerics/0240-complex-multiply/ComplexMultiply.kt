data class Complex(val re: Int, val im: Int) {
    operator fun times(o: Complex) =
        Complex(re * o.re - im * o.im, re * o.im + im * o.re)
}

fun main() {
    val r = Complex(1, 2) * Complex(3, 4)
    println("${r.re} ${r.im}")
}
