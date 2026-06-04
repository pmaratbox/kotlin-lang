fun check(actual: Int, expected: Int) {
    if (actual != expected) throw AssertionError("expected $expected but got $actual")
}

fun main() {
    check(1 + 1, 2)
    check(2 * 3, 6)
    check("hello".length, 5)
    println("all passed")
}
