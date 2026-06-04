fun parseFlat(json: String): List<Pair<String, Int>> =
    json.trim().removePrefix("{").removeSuffix("}")
        .split(",")
        .map { entry ->
            val (k, v) = entry.split(":")
            k.trim().trim('"') to v.trim().toInt()
        }

fun main() {
    val entries = parseFlat("""{"x":1,"y":2}""")
    println(entries.joinToString(" ") { (k, v) -> "$k=$v" })
}
