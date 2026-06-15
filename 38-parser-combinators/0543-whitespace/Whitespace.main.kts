@file:DependsOn("org.jparsec:jparsec:3.1")
import org.jparsec.Scanners
import org.jparsec.Parsers

val num = Scanners.INTEGER.map { it.toInt() }
val skip = Scanners.WHITESPACES.optional(null)
// surround the integer parser with optional whitespace, keep only the number
val padded = Parsers.sequence(skip, num, skip) { _, n, _ -> n }

println(padded.parse("  42  "))
