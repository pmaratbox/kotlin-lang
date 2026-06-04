data class Person(val name: String, val age: Int)

fun toJson(p: Person): String = """{"name":"${p.name}","age":${p.age}}"""

fun main() {
    println(toJson(Person("Ada", 36)))
}
