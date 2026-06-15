@file:DependsOn("io.kotest:kotest-property-jvm:5.9.1")

import io.kotest.property.forAll
import kotlinx.coroutines.runBlocking
import java.io.OutputStream
import java.io.PrintStream

// A deliberately FALSE property: "every non-negative integer is < 100".
// kotest's forAll generates integers and is virtually guaranteed to produce a
// counterexample (>= 100), throwing an AssertionError. We catch it to detect the
// failure. kotest writes its falsifying-example / shrink report to STDOUT, so we
// redirect System.out to a null stream during the run and restore it afterward,
// ensuring only `found` is printed.
runBlocking {
    val original = System.out
    var found = false
    System.setOut(PrintStream(OutputStream.nullOutputStream()))
    try {
        forAll<Int> { n -> n < 100 }
    } catch (e: AssertionError) {
        found = true
    } finally {
        System.setOut(original)
    }
    println(if (found) "found" else "no-ce")
}
