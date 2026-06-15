# 0451 — Order by

Defines a `users` table with the JetBrains Exposed query-builder (`org.jetbrains.exposed:exposed-core` / `exposed-jdbc`) over an in-memory SQLite database (`org.xerial:sqlite-jdbc`). Inserts three rows via the `Table.insert` DSL, then runs `Users.selectAll().orderBy(Users.age to SortOrder.ASC)` to sort by age ascending and prints each user's name.

## Run

    kotlin OrderBy.main.kts
