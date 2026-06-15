# 0452 — Limit

Defines a `Users` model (`id`, `name`, `age`) as an Exposed `Table` object over an in-memory SQLite database, inserts the three sample rows through the Exposed DSL (`Users.insert { ... }`), then takes only the top N rows with `Users.selectAll().orderBy(Users.age to SortOrder.DESC).limit(2)` and prints each name. Uses the real JetBrains Exposed query-builder (`org.jetbrains.exposed:exposed-core` / `exposed-jdbc`) on the `org.xerial:sqlite-jdbc` driver.

## Run

    kotlin Limit.main.kts
