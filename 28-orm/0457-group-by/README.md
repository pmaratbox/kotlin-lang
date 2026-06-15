# 0457 — Group by

Defines a `Products` model (`id`, `category`, `price`) as an Exposed `Table` object over an in-memory SQLite database, inserts three rows through the Exposed DSL, then aggregates with the query-builder's group-by API: `Products.select(category, price.sum()).groupBy(category).orderBy(category)`. Prints each `category sum` pair. Uses the real JetBrains Exposed query-builder (`org.jetbrains.exposed:exposed-core` / `exposed-jdbc`) on the `org.xerial:sqlite-jdbc` driver.

## Run

    kotlin GroupBy.main.kts
