fun isRotation(a: String, b: String): Boolean =
    a.length == b.length && (a + a).contains(b)

fun main() {
    println(if (isRotation("abcd", "cdab")) "yes" else "no")
}
