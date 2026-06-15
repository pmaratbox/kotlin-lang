@file:DependsOn("org.jparsec:jparsec:3.1")

import org.jparsec.Parsers
import org.jparsec.Scanners

// Two single-character parsers built from jparsec combinators.
val a = Scanners.isChar('a').retn("a")
val b = Scanners.isChar('b').retn("b")

// Parsers.sequence runs `a` THEN `b`, combining the two results.
val ab = Parsers.sequence(a, b) { x, y -> x + y }

println(ab.parse("ab"))
