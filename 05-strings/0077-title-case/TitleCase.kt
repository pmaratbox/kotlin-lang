fun main() {
    val text = "hello world"
    val result = text.split(" ").joinToString(" ") { word ->
        word.replaceFirstChar { it.uppercase() }
    }
    println(result)
}
