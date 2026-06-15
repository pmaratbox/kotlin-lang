# 0512 — Query variables

This lesson uses the `graphql-java` library to define a schema with `Query.item(id: Int!): Item` and execute a query in-process (no HTTP server). The query declares a `$id` variable, and instead of interpolating the value into the query string we pass it through the execution's variables map via `ExecutionInput.variables(...)`. The resolver reads the `id` argument and returns it, and we extract `data.item.id` from the execution result.

## Run

    kotlin Variables.main.kts
