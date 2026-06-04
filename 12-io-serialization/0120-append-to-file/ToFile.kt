import java.io.File

fun main() {
    val file = File("data.txt")
    file.writeText("a\n")
    file.appendText("b\n")
    val joined = file.readLines().joinToString(" ")
    file.delete()
    println(joined)
}
