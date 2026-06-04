fun label(flag: Boolean): String = if (flag) "enabled" else "disabled"

fun main() {
    println("${label(true)} ${label(false)}")
}
