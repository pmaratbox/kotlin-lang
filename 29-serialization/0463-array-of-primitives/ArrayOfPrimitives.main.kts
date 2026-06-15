@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
val m = ObjectMapper().registerKotlinModule()
val nums = listOf(1, 2, 3)
println(m.writeValueAsString(nums))
