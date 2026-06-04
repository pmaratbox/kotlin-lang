fun main() {
    val ini = "[s]\nk=v"
    var section = ""
    val entries = mutableListOf<String>()
    for (raw in ini.lines()) {
        val line = raw.trim()
        when {
            line.isEmpty() -> {}
            line.startsWith("[") && line.endsWith("]") -> section = line.substring(1, line.length - 1)
            "=" in line -> {
                val (key, value) = line.split("=", limit = 2)
                entries.add("$section.$key=$value")
            }
        }
    }
    println(entries.joinToString("\n"))
}
