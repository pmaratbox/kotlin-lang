@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

val mapper = ObjectMapper().registerKotlinModule()

val json = """{"user":{"name":"alice","roles":["admin","user"]}}"""

// Parse into a dynamic tree and read a deeply nested value.
val root = mapper.readTree(json)
val name = root.path("user").path("name").asText()
val firstRole = root.path("user").path("roles").get(0).asText()

println("$name $firstRole")
