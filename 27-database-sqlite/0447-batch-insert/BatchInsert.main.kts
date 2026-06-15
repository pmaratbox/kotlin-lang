@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table t(n integer)")
c.autoCommit = false
val ins = c.prepareStatement("insert into t values(?)")
for (n in 1..1000) {
    ins.setInt(1, n); ins.addBatch()
}
ins.executeBatch()
c.commit()
val rs = c.createStatement().executeQuery("select count(*) from t")
rs.next()
println(rs.getInt(1))
