// kotest property: forAll can take MULTIPLE generators and check a property
// over several generated arguments at once. forAll is suspend, so wrap it in
// runBlocking. It throws AssertionError on a counterexample; here the property
// is universally true, so it always passes.
@file:DependsOn("io.kotest:kotest-property-jvm:5.9.1")

import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.forAll
import kotlinx.coroutines.runBlocking

runBlocking {
    // Property over TWO generated integer args a, b:
    // max(a, b) >= a AND max(a, b) >= b.
    forAll(Arb.int(), Arb.int()) { a, b ->
        val m = maxOf(a, b)
        m >= a && m >= b
    }
    println("passed")
}
