import java.io.File

fun main() {
    val file = File("lines.txt")
    file.writeText("one\ntwo\nthree\n")
    val count = file.readLines().count { it.isNotEmpty() }
    file.delete()
    println("lines: $count")
}
