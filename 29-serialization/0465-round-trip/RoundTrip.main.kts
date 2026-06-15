@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

data class Person(val age: Int, val name: String)

val mapper = ObjectMapper().registerKotlinModule()

val json = mapper.writeValueAsString(Person(30, "alice"))
val person = mapper.readValue(json, Person::class.java)
println(person.name)
