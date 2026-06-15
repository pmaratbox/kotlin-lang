// Property-based test run PROGRAMMATICALLY with kotest-property.
// io.kotest.property.forAll is a suspend function (wrap in runBlocking) that
// generates ~1000 inputs from the default Arb<Int> and throws AssertionError
// only if the property is ever false. Here the property holds universally.
@file:DependsOn("io.kotest:kotest-property-jvm:5.9.1")

import io.kotest.property.forAll
import kotlinx.coroutines.runBlocking

runBlocking {
    // Property: addition is commutative for generated integers a, b.
    forAll<Int, Int> { a, b -> a + b == b + a }
    println("passed")
}
