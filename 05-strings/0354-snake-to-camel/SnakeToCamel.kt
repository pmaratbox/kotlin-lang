fun snakeToCamel(s: String): String {
    val parts = s.split("_")
    return parts.first() + parts.drop(1).joinToString("") { it.replaceFirstChar(Char::uppercase) }
}

fun main() {
    println(snakeToCamel("hello_world"))
}
