@file:DependsOn("com.graphql-java:graphql-java:22.3")
import graphql.GraphQL
import graphql.schema.idl.*

val reg = SchemaParser().parse(
    """
    type User { name: String }
    type Query { user: User }
    """.trimIndent()
)
val wiring = RuntimeWiring.newRuntimeWiring()
    .type("Query") { b -> b.dataFetcher("user") { _ -> mapOf("name" to "alice") } }
    .build()
val schema = SchemaGenerator().makeExecutableSchema(reg, wiring)
val data = GraphQL.newGraphQL(schema).build().execute("{ user { name } }").getData<Map<String, Any>>()

@Suppress("UNCHECKED_CAST")
val user = data["user"] as Map<String, Any>
println(user["name"])
