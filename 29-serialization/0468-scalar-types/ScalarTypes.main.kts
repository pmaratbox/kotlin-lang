@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

data class Config(val active: Boolean, val count: Int, val label: String)

val m = ObjectMapper().registerKotlinModule()
println(m.writeValueAsString(Config(active = true, count = 5, label = "x")))
