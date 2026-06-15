# 0443 — Order by & limit

Creates an in-memory SQLite table, inserts six scores, and runs `select value from scores order by value desc limit 3` to sort descending and take the top rows, printing each value on its own line. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, `PreparedStatement`, `ResultSet`).

## Run

    kotlin OrderByLimit.main.kts
