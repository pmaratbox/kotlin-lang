# 0441 — Aggregate functions

Creates an in-memory SQLite table, inserts five amounts, and runs a single query using the `count(*)`, `sum`, `min`, and `max` aggregate functions, printing each result on its own line. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, `PreparedStatement`, `ResultSet`).

## Run

    kotlin AggregateFunctions.main.kts
