# 0456 — Sum aggregate

Defines a `users(id, name, age)` table with the JetBrains Exposed query builder, inserts three rows into an in-memory SQLite database, then computes the total age with Exposed's `sum()` aggregate (`Users.age.sum()`) selected via `Table.select(...)`. Uses `org.jetbrains.exposed:exposed-core`/`exposed-jdbc` over the `org.xerial:sqlite-jdbc` driver, all inside a single `transaction { }`.

## Run

    kotlin SumAggregate.main.kts
