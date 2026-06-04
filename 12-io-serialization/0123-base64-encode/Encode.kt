import java.util.Base64

fun main() {
    val encoded = Base64.getEncoder().encodeToString("hi".toByteArray(Charsets.UTF_8))
    println(encoded)
}
