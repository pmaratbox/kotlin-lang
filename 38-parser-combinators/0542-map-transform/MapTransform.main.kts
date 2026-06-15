@file:DependsOn("org.jparsec:jparsec:3.1")

import org.jparsec.Scanners

// Build the parser from jparsec combinators:
//   Scanners.INTEGER parses a run of digits as text,
//   .map { ... } transforms the parsed value -> here Int doubled.
val doubled = Scanners.INTEGER.map { it.toInt() * 2 }

// Run the combinator parser on the fixed input "21".
println(doubled.parse("21"))
