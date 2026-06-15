@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

data class Person(val age: Int, val name: String)

val mapper = ObjectMapper().registerKotlinModule()
val people = listOf(Person(30, "alice"), Person(25, "bob"))
println(mapper.writeValueAsString(people))
