fun main() {
    val price = 25
    var total = 0
    for (coin in listOf(10, 10, 5)) {
        total += coin
        if (total >= price) {
            println("dispensed")
            break
        }
    }
}
