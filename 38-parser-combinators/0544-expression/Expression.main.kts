@file:DependsOn("org.jparsec:jparsec:3.1")

import org.jparsec.Scanners

// A single integer parser, mapping the matched text to an Int.
val num = Scanners.INTEGER.map { it.toInt() }

// sepBy1 combinator: one-or-more `num` separated by the '+' literal.
// The result is a List<Int>, which we fold into a sum.
val expr = num.sepBy1(Scanners.isChar('+')).map { it.sum() }

fun main() {
    println(expr.parse("10+20+30"))
}

main()
