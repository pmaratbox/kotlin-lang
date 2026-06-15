@file:DependsOn("org.jparsec:jparsec:3.1")

import org.jparsec.Scanners

// `Parser.many()` repeats its parser zero-or-more times, collecting every
// match into a list. Here we repeat `isChar('a')` over the fixed input "aaaa"
// and print how many characters were consumed.
val a = Scanners.isChar('a').retn('a')
val manyA = a.many()

val parsed = manyA.parse("aaaa")
println(parsed.size)
