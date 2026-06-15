# 0450 — Filter with where

Defines a `users` table with the JetBrains Exposed query-builder (`org.jetbrains.exposed:exposed-core` / `exposed-jdbc`) over an in-memory SQLite database (`org.xerial:sqlite-jdbc`). Inserts three rows, then uses the Exposed DSL `Table.selectAll().where { ... }` filter with `greaterEq` and `orderBy(Users.id)` to return only rows with `age >= 30`, printing each name on its own line.

## Run

    kotlin FilterWhere.main.kts
