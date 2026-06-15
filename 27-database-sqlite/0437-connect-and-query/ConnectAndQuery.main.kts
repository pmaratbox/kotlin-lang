@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
val rs = c.createStatement().executeQuery("select 42")
while (rs.next()) println(rs.getInt(1))
