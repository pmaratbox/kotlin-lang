sealed class Bounce<out A> {
    data class Done<A>(val result: A) : Bounce<A>()
    data class More<A>(val next: () -> Bounce<A>) : Bounce<A>()
}

tailrec fun <A> run(b: Bounce<A>): A = when (b) {
    is Bounce.Done -> b.result
    is Bounce.More -> run(b.next())
}

fun sum(n: Int, acc: Int): Bounce<Int> =
    if (n == 0) Bounce.Done(acc) else Bounce.More { sum(n - 1, acc + n) }

fun main() {
    println(run(sum(100, 0)))
}
