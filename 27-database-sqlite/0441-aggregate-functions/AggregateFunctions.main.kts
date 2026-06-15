@file:DependsOn("org.xerial:sqlite-jdbc:3.46.1.3")
import java.sql.DriverManager
val c = DriverManager.getConnection("jdbc:sqlite::memory:")
c.createStatement().execute("create table t(amount integer)")
val ins = c.prepareStatement("insert into t values(?)")
for (amount in listOf(10, 20, 30, 40, 50)) {
    ins.setInt(1, amount); ins.executeUpdate()
}
val rs = c.createStatement().executeQuery(
    "select count(*),sum(amount),min(amount),max(amount) from t"
)
rs.next()
println(rs.getLong(1))
println(rs.getLong(2))
println(rs.getLong(3))
println(rs.getLong(4))
