@file:DependsOn("com.graphql-java:graphql-java:22.3")
import graphql.GraphQL
import graphql.schema.idl.*

val registry = SchemaParser().parse("type Query { hello: String }")
val wiring = RuntimeWiring.newRuntimeWiring()
    .type("Query") { b -> b.dataFetcher("hello") { _ -> "world" } }
    .build()
val schema = SchemaGenerator().makeExecutableSchema(registry, wiring)
val graphQL = GraphQL.newGraphQL(schema).build()

val data = graphQL.execute("{ hello }").getData<Map<String, Any>>()
println(data["hello"])
