@file:DependsOn("com.graphql-java:graphql-java:22.3")
import graphql.ExecutionInput
import graphql.GraphQL
import graphql.schema.idl.*

val reg = SchemaParser().parse(
    """
    type Query { item(id: Int!): Item }
    type Item { id: Int }
    """.trimIndent()
)

val wiring = RuntimeWiring.newRuntimeWiring()
    .type("Query") { b ->
        b.dataFetcher("item") { env ->
            mapOf("id" to env.getArgument<Int>("id"))
        }
    }
    .build()

val schema = SchemaGenerator().makeExecutableSchema(reg, wiring)

val input = ExecutionInput.newExecutionInput()
    .query("query(\$id: Int!) { item(id: \$id) { id } }")
    .variables(mapOf("id" to 42))
    .build()

val data = GraphQL.newGraphQL(schema).build().execute(input).getData<Map<String, Any>>()

@Suppress("UNCHECKED_CAST")
val item = data["item"] as Map<String, Any>
println(item["id"])
