data class Address(val city: String)
data class Person(val name: String, val address: Address)

fun main() {
    val person = Person("Ada", Address("London"))
    println(person.address.city)
}
