@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

data class Person(@JsonProperty("full_name") val fullName: String)

val m = ObjectMapper().registerKotlinModule()
println(m.writeValueAsString(Person("alice")))
