# 0442 — Group by

Creates an in-memory SQLite database with a `sales` table, inserts five rows across two categories, then runs `select category,sum(amount) from sales group by category order by category` to aggregate the amounts per category and prints each result as `category sum`. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, prepared statements, and `ResultSet` iteration).

## Run

    kotlin GroupBy.main.kts
