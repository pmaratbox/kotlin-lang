# 0454 — Delete a row

Defines a `users` table with the JetBrains Exposed query-builder (`org.jetbrains.exposed:exposed-core` / `exposed-jdbc`) over an in-memory SQLite database (`org.xerial:sqlite-jdbc`). Inserts three rows via the `Table.insert` DSL, then removes the user with `id = 1` using `Users.deleteWhere { Users.id eq 1 }`, and finally reads the remaining rows with `Users.selectAll().orderBy(Users.id to SortOrder.ASC)`, printing each user's name.

## Run

    kotlin DeleteRow.main.kts
