# 0440 — Update & delete

Creates an in-memory SQLite database, inserts three users, then runs an `UPDATE` to rename one row and a `DELETE` to remove another, and finally reads the remaining rows back with a `SELECT ... ORDER BY id`, printing each as `id name`. Uses the real `org.xerial:sqlite-jdbc` driver through raw JDBC (`DriverManager`, `Statement`, `PreparedStatement`).

## Run

    kotlin UpdateDelete.main.kts
