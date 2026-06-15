# 0445 — Transactions

Creates an in-memory SQLite database with a single-column table, then exercises real transaction control by turning off auto-commit: one transaction inserts `1` and `2` and `COMMIT`s, a second transaction inserts `3` and then `ROLLBACK`s it away. A final `SELECT n FROM t ORDER BY n` reads back the surviving rows, printing each, so only `1` and `2` appear. Uses the real `org.xerial:sqlite-jdbc` driver through raw JDBC (`DriverManager`, `Connection.autoCommit`, `commit`, `rollback`, `Statement`).

## Run

    kotlin TransactionCommitRollback.main.kts
