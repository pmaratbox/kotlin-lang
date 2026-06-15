# 0507 — Object field

Uses [graphql-java](https://www.graphql-java.com/), the reference GraphQL
engine for the JVM. The schema declares an object type `User { name: String }`
and a `Query { user: User }`. The `user` data fetcher returns a plain map
`{name: "alice"}`, and graphql-java resolves the nested field selection. The
query `{ user { name } }` is executed in-process (no HTTP server), and the
resolved `data.user.name` is extracted from the execution result and printed.

## Run

    kotlin ObjectField.main.kts
