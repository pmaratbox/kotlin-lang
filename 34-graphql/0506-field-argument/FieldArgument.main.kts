@file:DependsOn("com.graphql-java:graphql-java:22.3")
import graphql.GraphQL
import graphql.schema.idl.*

val reg = SchemaParser().parse("type Query { greet(name: String!): String }")
val wiring = RuntimeWiring.newRuntimeWiring()
    .type("Query") { b ->
        b.dataFetcher("greet") { env -> "hello " + env.getArgument<String>("name") }
    }.build()
val schema = SchemaGenerator().makeExecutableSchema(reg, wiring)
val data = GraphQL.newGraphQL(schema).build()
    .execute("{ greet(name: \"alice\") }").getData<Map<String, Any>>()
println(data["greet"])
