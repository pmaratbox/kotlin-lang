# 0453 — Update a row

Define a `users` table with JetBrains Exposed, seed three rows, then modify a persisted entity with Exposed's DSL `Table.update { }` statement (setting bob's age to 40). Re-query with `selectAll().where { age greaterEq 35 }.orderBy(id)` over an in-memory SQLite database and print `name age` for each match.

## Run

    kotlin UpdateRow.main.kts
