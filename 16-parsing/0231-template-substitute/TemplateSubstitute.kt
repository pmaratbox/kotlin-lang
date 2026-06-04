fun render(template: String, vars: Map<String, String>): String {
    return Regex("\\{(\\w+)}").replace(template) { m ->
        vars[m.groupValues[1]] ?: m.value
    }
}

fun main() {
    println(render("hi {name}", mapOf("name" to "Ada")))
}
