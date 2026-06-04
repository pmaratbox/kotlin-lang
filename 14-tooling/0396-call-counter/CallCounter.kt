fun counted(fn: () -> Unit): Pair<() -> Unit, () -> Int> {
    var count = 0
    val wrapped = {
        count++
        fn()
    }
    return wrapped to { count }
}

fun main() {
    val (call, calls) = counted { }
    repeat(5) { call() }
    println("calls: ${calls()}")
}
