import java.util.Locale

fun main() {
    var x = 2.0
    repeat(20) {
        x -= (x * x - 2.0) / (2.0 * x)
    }
    println(String.format(Locale.US, "%.4f", x))
}
