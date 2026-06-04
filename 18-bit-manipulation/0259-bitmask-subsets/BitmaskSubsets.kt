fun main() {
    val mask = 5
    val subs = mutableListOf<Int>()
    var sub = mask
    while (true) {
        subs.add(sub)
        if (sub == 0) break
        sub = (sub - 1) and mask
    }
    println(subs.joinToString(" "))
}
