# 0506 — Field argument

Uses the **graphql-java** library to build a schema in-process. The `Query.greet(name: String!)` field declares a field argument; the data fetcher reads it via `env.getArgument("name")` and returns `"hello " + name`. The query `{ greet(name: "alice") }` is executed in-process and `data.greet` is printed.

## Run

    kotlin FieldArgument.main.kts
