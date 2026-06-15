@file:DependsOn("com.graphql-java:graphql-java:22.3")
import graphql.GraphQL
import graphql.schema.idl.*

val sdl = """
    type Address { city: String }
    type User { address: Address }
    type Query { user: User }
""".trimIndent()

val registry = SchemaParser().parse(sdl)
val wiring = RuntimeWiring.newRuntimeWiring()
    .type("Query") { b -> b.dataFetcher("user") { _ -> mapOf("address" to mapOf("city" to "oslo")) } }
    .build()
val schema = SchemaGenerator().makeExecutableSchema(registry, wiring)
val graphQL = GraphQL.newGraphQL(schema).build()

val data = graphQL.execute("{ user { address { city } } }").getData<Map<String, Any>>()
@Suppress("UNCHECKED_CAST")
val user = data["user"] as Map<String, Any>
@Suppress("UNCHECKED_CAST")
val address = user["address"] as Map<String, Any>
println(address["city"])
