@file:DependsOn("org.jparsec:jparsec:3.1")

import org.jparsec.Scanners

// Build the parser from combinators: Scanners.INTEGER matches a run of
// digits, and `.map` transforms the matched text into an Int.
val integer = Scanners.INTEGER.map { it.toInt() }

// Run the combinator parser on the fixed input.
val result = integer.parse("42")

println(result)
