@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table inv(item text primary key, qty integer)")
c.createStatement().execute("insert into inv values('apple', 5)")
val up = c.prepareStatement(
    "insert into inv values(?,?) on conflict(item) do update set qty=qty+excluded.qty"
)
for ((item, qty) in listOf("apple" to 5, "banana" to 3)) {
    up.setString(1, item); up.setInt(2, qty); up.executeUpdate()
}
val rs = c.createStatement().executeQuery("select item,qty from inv order by item")
while (rs.next()) println("${rs.getString(1)} ${rs.getInt(2)}")
