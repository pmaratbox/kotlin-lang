# 0505 — Hello query

Uses the `graphql-java` library to define a GraphQL schema and execute a query entirely in-process — no HTTP server. We parse the SDL `type Query { hello: String }`, wire a data fetcher that resolves `hello` to `"world"`, build an executable schema, and run the query `{ hello }`. The resolved value is read back out of the execution result's `data` map and printed.

## Run

    kotlin HelloQuery.main.kts
