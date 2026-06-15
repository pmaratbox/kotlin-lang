# 0439 — Parameterized query

Creates an in-memory SQLite table of users, then runs `select name from users where id=?` with the value 2 supplied through a real bound parameter (`PreparedStatement.setInt`) rather than string interpolation, and prints the matching name. Uses the org.xerial:sqlite-jdbc driver via raw JDBC.

## Run

    kotlin ParameterizedQuery.main.kts
