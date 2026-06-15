# 0446 — Indexes

Creates an in-memory products table, inserts three rows, then executes a `create index idx_sku on products(sku)` statement and performs a parameterized lookup `select price from products where sku=?` bound to 'B'. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, `PreparedStatement`, `ResultSet`).

## Run

    kotlin Indexes.main.kts
