# 0447 — Batch insert

Insert 1000 rows (values 1..1000) into a `t(n integer)` table efficiently using JDBC batching inside a single transaction, then `select count(*)` and print the count. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC with `PreparedStatement.addBatch`/`executeBatch` and an explicit `commit`.

## Run

    kotlin BatchInsert.main.kts
