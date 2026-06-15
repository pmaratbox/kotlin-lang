@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table t(n integer)")
c.autoCommit = false
c.createStatement().execute("insert into t values(1)")
c.createStatement().execute("insert into t values(2)")
c.commit()
c.createStatement().execute("insert into t values(3)")
c.rollback()
val rs = c.createStatement().executeQuery("select n from t order by n")
while (rs.next()) println(rs.getInt(1))
