fun counter(): () -> Int {
    var count = 0
    return {
        count += 1
        count
    }
}

fun main() {
    val next = counter()
    println("count: ${next()}")
    println("count: ${next()}")
}
