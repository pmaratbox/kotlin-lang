// kotest property: forAll generates inputs and checks a boolean property.
// forAll is suspend, so wrap it in runBlocking. It throws AssertionError on a
// counterexample; here the property is universally true, so it always passes.
@file:DependsOn("io.kotest:kotest-property-jvm:5.9.1")

import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.arbitrary.list
import io.kotest.property.forAll
import kotlinx.coroutines.runBlocking

runBlocking {
    // Property: reversing a list twice yields the original list.
    // Checked over ~100 generated integer lists produced by Arb.list(Arb.int()).
    forAll(Arb.list(Arb.int())) { xs ->
        xs.reversed().reversed() == xs
    }
    println("passed")
}
