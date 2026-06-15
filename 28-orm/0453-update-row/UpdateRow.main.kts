@file:DependsOn("org.jetbrains.exposed:exposed-core:0.55.0")
@file:DependsOn("org.jetbrains.exposed:exposed-jdbc:0.55.0")
@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
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

    // Update bob's age to 40 via the DSL update statement.
    Users.update({ Users.name eq "bob" }) { it[age] = 40 }

    Users.selectAll()
        .where { Users.age greaterEq 35 }
        .orderBy(Users.id)
        .forEach { println("${it[Users.name]} ${it[Users.age]}") }
}
