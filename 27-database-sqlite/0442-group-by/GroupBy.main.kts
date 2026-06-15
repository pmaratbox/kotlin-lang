@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table sales(category text, amount integer)")
val ins = c.prepareStatement("insert into sales values(?,?)")
for ((category, amount) in listOf("a" to 10, "b" to 20, "a" to 30, "b" to 5, "a" to 2)) {
    ins.setString(1, category); ins.setInt(2, amount); ins.executeUpdate()
}
val rs = c.createStatement().executeQuery("select category,sum(amount) from sales group by category order by category")
while (rs.next()) println("${rs.getString(1)} ${rs.getInt(2)}")
