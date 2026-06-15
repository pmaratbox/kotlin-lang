@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table users(id integer, name text)")
val ins = c.prepareStatement("insert into users values(?,?)")
for ((id, name) in listOf(1 to "alice", 2 to "bob", 3 to "carol")) {
    ins.setInt(1, id); ins.setString(2, name); ins.executeUpdate()
}
val sel = c.prepareStatement("select name from users where id=?")
sel.setInt(1, 2)
val rs = sel.executeQuery()
while (rs.next()) println(rs.getString(1))
