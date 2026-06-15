// kotest property: a PRECONDITION constrains which generated inputs are tested.
// Arb.int().filter { ... } discards any generated value that does not satisfy
// the predicate, so only positive integers ever reach the property. forAll is
// suspend (wrap in runBlocking) and throws AssertionError on a counterexample;
// here n + 1 > n holds for every positive n, so the check passes.
@file:DependsOn("io.kotest:kotest-property-jvm:5.9.1")

import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.arbitrary.filter
import io.kotest.property.forAll
import kotlinx.coroutines.runBlocking

runBlocking {
    // Precondition via filter: only positive integers are generated/tested
    // (and below Int.MAX_VALUE so that n + 1 cannot overflow).
    val positives = Arb.int().filter { it > 0 && it < Int.MAX_VALUE }
    forAll(positives) { n ->
        n + 1 > n
    }
    println("passed")
}
