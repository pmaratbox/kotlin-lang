fun main() {
    val ops = mapOf<String, (Int, Int) -> Int>(
        "add" to { a, b -> a + b },
        "mul" to { a, b -> a * b }
    )
    println("${ops.getValue("add")(3, 4)} ${ops.getValue("mul")(3, 4)}")
}
