fun main() {
    val strategies = mapOf<String, (Int, Int) -> Int>(
        "add" to { a, b -> a + b },
        "mul" to { a, b -> a * b }
    )
    val add = strategies.getValue("add")
    val mul = strategies.getValue("mul")
    println("${add(3, 4)} ${mul(3, 4)}")
}
