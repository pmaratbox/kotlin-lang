@file:DependsOn("org.jparsec:jparsec:3.1")

import org.jparsec.Scanners

val num = Scanners.INTEGER.map { it.toInt() }
val list = num.sepBy(Scanners.isChar(','))

val parsed: List<Int> = list.parse("1,2,3")
println(parsed.sum())
