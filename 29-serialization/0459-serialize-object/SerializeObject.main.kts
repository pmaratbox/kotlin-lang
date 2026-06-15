@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
data class Person(val age: Int, val name: String)
val mapper = ObjectMapper().registerKotlinModule()
println(mapper.writeValueAsString(Person(age = 30, name = "alice")))
