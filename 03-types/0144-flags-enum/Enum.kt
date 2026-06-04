const val READ = 1
const val WRITE = 2

fun main() {
    val flags = READ or WRITE
    val set = if (flags and WRITE != 0) "yes" else "no"
    println("$flags $set")
}
