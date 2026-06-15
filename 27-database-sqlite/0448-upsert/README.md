# 0448 — Upsert

Creates an `inv(item text primary key, qty integer)` table in an in-memory SQLite database, inserts `('apple', 5)`, then upserts `apple` and `banana` with `insert ... on conflict(item) do update set qty=qty+excluded.qty` so the existing apple row accumulates to 10 while banana is inserted fresh, and finally runs `select item,qty from inv order by item` printing each as `item qty`. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, `PreparedStatement`, `ResultSet`).

## Run

    kotlin Upsert.main.kts
