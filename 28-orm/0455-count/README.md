# 0455 — Count

Defines a `users` table with the JetBrains Exposed ORM/query-builder, connects to an in-memory SQLite database, inserts three rows, and counts all rows with Exposed's `selectAll().count()` aggregate, printing the total. Uses the real `org.jetbrains.exposed:exposed-core`/`exposed-jdbc` library over the `org.xerial:sqlite-jdbc` driver.

## Run

    kotlin Count.main.kts
