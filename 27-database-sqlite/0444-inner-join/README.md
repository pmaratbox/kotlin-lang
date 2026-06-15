# 0444 — Inner join

Open an in-memory SQLite database with the real `org.xerial:sqlite-jdbc` driver over raw JDBC, create `users` and `orders` tables, insert rows, then run an `inner join` of `orders` against `users` on the user key ordered by name and item. Each joined row is printed as `name item` from the `ResultSet`.

## Run

    kotlin InnerJoin.main.kts
