@file:DependsOn("org.jparsec:jparsec:3.1")

import org.jparsec.Parser
import org.jparsec.Parsers
import org.jparsec.Scanners

// Two alternative parsers: the literal "cat" OR the literal "dog".
val cat: Parser<String> = Scanners.string("cat").retn("cat")
val dog: Parser<String> = Scanners.string("dog").retn("dog")

// Parsers.or is the alternative/choice combinator: try `cat`, else `dog`.
val animal: Parser<String> = Parsers.or(cat, dog)

println(animal.parse("dog"))
