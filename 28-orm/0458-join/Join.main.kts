@file:DependsOn("org.jetbrains.exposed:exposed-core:0.55.0")
@file:DependsOn("org.jetbrains.exposed:exposed-jdbc:0.55.0")
@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

object Users : Table("users") {
    val id = integer("id")
    val name = varchar("name", 50)
    override val primaryKey = PrimaryKey(id)
}

object Posts : Table("posts") {
    val id = integer("id")
    val userId = integer("user_id") references Users.id
    val title = varchar("title", 50)
    override val primaryKey = PrimaryKey(id)
}

Database.connect("jdbc:sqlite::memory:", "org.sqlite.JDBC")
transaction {
    SchemaUtils.create(Users, Posts)
    listOf(1 to "alice", 2 to "bob").forEach { (i, n) ->
        Users.insert { it[id] = i; it[name] = n }
    }
    listOf(Triple(1, 1, "hello"), Triple(2, 1, "world"), Triple(3, 2, "hi")).forEach { (i, u, t) ->
        Posts.insert { it[id] = i; it[userId] = u; it[title] = t }
    }
    (Posts innerJoin Users)
        .select(Users.name, Posts.title)
        .orderBy(Users.name to SortOrder.ASC, Posts.title to SortOrder.ASC)
        .forEach { println("${it[Users.name]} ${it[Posts.title]}") }
}
