data class Test(val name: String, val body: () -> Unit)

fun main() {
    val tests = listOf(
        Test("addition") { require(1 + 1 == 2) },
        Test("multiplication") { require(2 * 3 == 6) },
        Test("string length") { require("hello".length == 5) }
    )

    var passed = 0
    var failed = 0
    for (test in tests) {
        try {
            test.body()
            passed++
        } catch (e: Throwable) {
            failed++
        }
    }
    println("$passed passed, $failed failed")
}
