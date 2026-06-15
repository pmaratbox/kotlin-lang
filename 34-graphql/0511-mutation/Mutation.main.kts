@file:DependsOn("com.graphql-java:graphql-java:22.3")
import graphql.GraphQL
import graphql.schema.idl.*

val reg = SchemaParser().parse(
    """
    type User { name: String }
    type Query { _empty: String }
    type Mutation { addUser(name: String!): User }
    """.trimIndent()
)
val wiring = RuntimeWiring.newRuntimeWiring()
    .type("Mutation") { b ->
        b.dataFetcher("addUser") { env -> mapOf("name" to env.getArgument<String>("name")) }
    }.build()
val schema = SchemaGenerator().makeExecutableSchema(reg, wiring)
val data = GraphQL.newGraphQL(schema).build()
    .execute("mutation { addUser(name: \"bob\") { name } }").getData<Map<String, Any>>()
val addUser = data["addUser"] as Map<*, *>
println(addUser["name"])
