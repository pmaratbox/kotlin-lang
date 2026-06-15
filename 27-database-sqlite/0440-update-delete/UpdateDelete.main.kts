@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table users(id integer, name text)")
val ins = c.prepareStatement("insert into users values(?,?)")
for ((id, name) in listOf(1 to "alice", 2 to "bob", 3 to "carol")) {
    ins.setInt(1, id); ins.setString(2, name); ins.executeUpdate()
}
c.createStatement().execute("update users set name='robert' where id=2")
c.createStatement().execute("delete from users where id=1")
val rs = c.createStatement().executeQuery("select id,name from users order by id")
while (rs.next()) println("${rs.getInt(1)} ${rs.getString(2)}")
