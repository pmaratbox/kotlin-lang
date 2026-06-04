import java.io.File

fun main() {
    val joined = File("/tmp", "file.txt").path.replace(File.separatorChar, '/')
    val base = joined.substringAfterLast('/')
    val ext = "." + base.substringAfterLast('.')
    println("$joined $base $ext")
}
