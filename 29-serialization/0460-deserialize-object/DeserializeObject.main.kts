@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

data class Person(val age: Int, val name: String)

val m = ObjectMapper().registerKotlinModule()
val p: Person = m.readValue("""{"age":30,"name":"alice"}""")
println("${p.name} ${p.age}")
