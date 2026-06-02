data class Person(val name: String, val age: Int)

fun main() {
    val p = Person("Ada", 36)

    println("name: ${p.name}")
    println("age: ${p.age}")
}
