@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

data class Address(val city: String, val zip: Int)
data class Person(val address: Address, val name: String)

val m = ObjectMapper().registerKotlinModule()
println(m.writeValueAsString(Person(Address("oslo", 1000), "alice")))
