@file:DependsOn("io.kotest:kotest-property-jvm:5.9.1")

import io.kotest.property.Arb
import io.kotest.property.arbitrary.string
import io.kotest.property.forAll
import kotlinx.coroutines.runBlocking

// Property: doubling a string doubles its length, i.e. (s + s).length == 2 * s.length.
// kotest's Arb.string() generates the inputs; forAll throws AssertionError on any
// counterexample. This property holds universally, so it never throws -> "passed".
runBlocking {
    forAll(Arb.string()) { s -> (s + s).length == 2 * s.length }
    println("passed")
}
