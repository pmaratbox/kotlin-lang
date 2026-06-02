import java.util.Locale

fun main() {
    println("pi: %.2f".format(Locale.US, 3.14159))
    println("id: %05d".format(42))
}
