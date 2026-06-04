fun parseRow(row: String): List<String> {
    val fields = mutableListOf<String>()
    val cur = StringBuilder()
    var inQuotes = false
    for (c in row) {
        when {
            c == '"' -> inQuotes = !inQuotes
            c == ',' && !inQuotes -> { fields.add(cur.toString()); cur.clear() }
            else -> cur.append(c)
        }
    }
    fields.add(cur.toString())
    return fields
}

fun main() {
    println(parseRow("a,\"b,c\",d").joinToString("|"))
}
