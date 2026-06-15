@file:DependsOn("org.jetbrains.exposed:exposed-core:0.55.0")
@file:DependsOn("org.jetbrains.exposed:exposed-jdbc:0.55.0")
@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

object Products : Table("products") {
    val id = integer("id")
    val category = varchar("category", 50)
    val price = integer("price")
    override val primaryKey = PrimaryKey(id)
}

Database.connect("jdbc:sqlite::memory:", "org.sqlite.JDBC")

transaction {
    SchemaUtils.create(Products)

    listOf(
        Triple(1, "a", 10),
        Triple(2, "b", 20),
        Triple(3, "a", 30),
    ).forEach { (i, c, p) ->
        Products.insert {
            it[id] = i
            it[category] = c
            it[price] = p
        }
    }

    val total = Products.price.sum()
    Products
        .select(Products.category, total)
        .groupBy(Products.category)
        .orderBy(Products.category)
        .forEach { row ->
            println("${row[Products.category]} ${row[total]}")
        }
}
