@file:DependsOn("io.kotest:kotest-property-jvm:5.9.1")

import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.arbitrary.map
import io.kotest.property.forAll
import kotlinx.coroutines.runBlocking

// Custom generator: take Arb.int() and .map it into an even-integer generator (n -> n * 2).
val evens: Arb<Int> = Arb.int().map { it * 2 }

runBlocking {
    // Property: every value produced by the custom generator is even.
    // forAll throws AssertionError only if a counterexample is found; here none exists.
    forAll(evens) { n -> n % 2 == 0 }
    println("passed")
}
