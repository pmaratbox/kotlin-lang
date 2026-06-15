# 0510 — Multiple fields

Uses [graphql-java](https://www.graphql-java.com/), the reference GraphQL
engine for the JVM. The schema declares an object type `User { name: String
age: Int }` and a `Query { user: User }`. The `user` data fetcher returns a
plain map `{name: "alice", age: 30}`, and the query `{ user { name age } }`
selects multiple fields of the same object. The query is executed in-process
(no HTTP server), and both resolved fields are extracted from the execution
result's `data.user` and printed, each on its own line.

## Run

    kotlin MultipleFields.main.kts
