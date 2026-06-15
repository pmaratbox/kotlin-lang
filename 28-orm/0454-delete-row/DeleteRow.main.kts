@file:DependsOn("org.jetbrains.exposed:exposed-core:0.55.0")
@file:DependsOn("org.jetbrains.exposed:exposed-jdbc:0.55.0")
@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.transactions.transaction

object Users : Table("users") {
    val id = integer("id")
    val name = varchar("name", 50)
    val age = integer("age")
    override val primaryKey = PrimaryKey(id)
}

Database.connect("jdbc:sqlite::memory:", "org.sqlite.JDBC")
transaction {
    SchemaUtils.create(Users)
    listOf(Triple(1, "alice", 30), Triple(2, "bob", 25), Triple(3, "carol", 35)).forEach { (i, n, a) ->
        Users.insert { it[id] = i; it[name] = n; it[age] = a }
    }
    Users.deleteWhere { Users.id eq 1 }
    Users.selectAll().orderBy(Users.id to SortOrder.ASC).forEach { println(it[Users.name]) }
}
