@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table scores(value integer)")
val ins = c.prepareStatement("insert into scores values(?)")
for (value in listOf(50, 90, 70, 30, 100, 20)) {
    ins.setInt(1, value); ins.executeUpdate()
}
val rs = c.createStatement().executeQuery(
    "select value from scores order by value desc limit 3"
)
while (rs.next()) println(rs.getInt(1))
