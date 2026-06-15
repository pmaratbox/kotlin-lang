@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table users(id integer, name text)")
c.createStatement().execute("create table orders(user_id integer, item text)")
val insU = c.prepareStatement("insert into users values(?,?)")
for ((id, name) in listOf(1 to "alice", 2 to "bob")) {
    insU.setInt(1, id); insU.setString(2, name); insU.executeUpdate()
}
val insO = c.prepareStatement("insert into orders values(?,?)")
for ((uid, item) in listOf(1 to "book", 2 to "pen", 1 to "lamp")) {
    insO.setInt(1, uid); insO.setString(2, item); insO.executeUpdate()
}
val rs = c.createStatement().executeQuery(
    "select u.name,o.item from orders o join users u on u.id=o.user_id order by u.name,o.item")
while (rs.next()) println("${rs.getString(1)} ${rs.getString(2)}")
