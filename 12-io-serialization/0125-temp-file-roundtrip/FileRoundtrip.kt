import java.io.File

fun main() {
    val file = File.createTempFile("roundtrip", ".txt")
    file.writeText("ok-data")
    val readBack = file.readText()
    val ok = readBack == "ok-data"
    file.delete()
    println("roundtrip: ${if (ok) "ok" else "fail"}")
}
