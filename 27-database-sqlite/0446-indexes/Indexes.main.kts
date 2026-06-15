@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table products(id integer, sku text, price integer)")
val ins = c.prepareStatement("insert into products values(?,?,?)")
for ((id, sku, price) in listOf(Triple(1, "A", 100), Triple(2, "B", 200), Triple(3, "C", 300))) {
    ins.setInt(1, id); ins.setString(2, sku); ins.setInt(3, price); ins.executeUpdate()
}
c.createStatement().execute("create index idx_sku on products(sku)")
val ps = c.prepareStatement("select price from products where sku=?")
ps.setString(1, "B")
val rs = ps.executeQuery()
while (rs.next()) println(rs.getInt(1))
