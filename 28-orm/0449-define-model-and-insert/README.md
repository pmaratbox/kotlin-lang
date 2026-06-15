# 0449 — Define model & insert

Defines a `Users` model (`id`, `name`, `age`) as an Exposed `Table` object over an in-memory SQLite database, creates the schema with `SchemaUtils.create`, inserts three rows through the Exposed DSL (`Users.insert { ... }`), then reads them back with `Users.selectAll().orderBy(Users.id)` and prints each name. Uses the real JetBrains Exposed query-builder (`org.jetbrains.exposed:exposed-core` / `exposed-jdbc`) on the `org.xerial:sqlite-jdbc` driver.

## Run

    kotlin DefineModelAndInsert.main.kts
