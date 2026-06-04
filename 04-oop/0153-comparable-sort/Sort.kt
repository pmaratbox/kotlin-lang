data class Person(val name: String, val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person) = age.compareTo(other.age)
}

fun main() {
    val people = listOf(Person("alice", 30), Person("bob", 25))
    println(people.sorted().joinToString(" ") { it.name })
}
