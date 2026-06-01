import java.io.File

fun main() {
    val file = File("greeting.txt")
    file.writeText("hello, file")
    val content = file.readText()
    file.delete()
    println("read: $content")
}
