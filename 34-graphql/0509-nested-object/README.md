# 0509 — Nested object

Uses the `graphql-java` library to define a GraphQL schema with nested object types and execute a query in-process — no HTTP server. We parse the SDL `type Address { city: String } type User { address: Address } type Query { user: User }`, wire a data fetcher that resolves `user` to a nested map, build an executable schema, and run `{ user { address { city } } }`. GraphQL walks the nested selection set, and the resolved `city` is read back out of the execution result's `data` map and printed.

## Run

    kotlin NestedObject.main.kts
