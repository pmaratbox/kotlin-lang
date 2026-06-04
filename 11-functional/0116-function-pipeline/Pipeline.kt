fun pipe(vararg fns: (Int) -> Int): (Int) -> Int = { x -> fns.fold(x) { acc, f -> f(acc) } }

fun main() {
    val inc: (Int) -> Int = { it + 1 }
    val double: (Int) -> Int = { it * 2 }
    val neg: (Int) -> Int = { -it }
    val p = pipe(inc, double, neg)
    println(p(3))
}
