@file:DependsOn("com.graphql-java:graphql-java:22.3")
import graphql.GraphQL
import graphql.schema.idl.*

val reg = SchemaParser().parse("type Query { numbers: [Int] }")
val wiring = RuntimeWiring.newRuntimeWiring()
    .type("Query") { b ->
        b.dataFetcher("numbers") { _ -> listOf(1, 2, 3) }
    }.build()
val schema = SchemaGenerator().makeExecutableSchema(reg, wiring)
val data = GraphQL.newGraphQL(schema).build()
    .execute("{ numbers }").getData<Map<String, Any>>()

@Suppress("UNCHECKED_CAST")
val numbers = data["numbers"] as List<Any>
for (n in numbers) println(n)
