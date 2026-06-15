# 0511 — Mutation

Uses the **graphql-java** library to build a schema in-process with a `Mutation` type. The field `addUser(name: String!): User` declares a mutation; its data fetcher reads the argument via `env.getArgument("name")` and returns a `User` object (a `Map`). The operation `mutation { addUser(name: "bob") { name } }` is executed in-process and `data.addUser.name` is printed.

## Run

    kotlin Mutation.main.kts
