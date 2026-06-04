fun main() {
    val houses = listOf(2, 7, 9, 3, 1)
    var rob = 0
    var skip = 0
    for (money in houses) {
        val newRob = skip + money
        skip = maxOf(skip, rob)
        rob = newRob
    }
    println(maxOf(rob, skip))
}
