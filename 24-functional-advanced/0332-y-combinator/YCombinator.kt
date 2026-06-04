// Self-application requires a recursive wrapper type in a typed language.
class Rec<A, B>(val f: (Rec<A, B>) -> (A) -> B) {
    operator fun invoke(r: Rec<A, B>): (A) -> B = f(r)
}

fun <A, B> fix(gen: ((A) -> B) -> (A) -> B): (A) -> B {
    val rec = Rec<A, B> { self -> { a -> gen(self(self))(a) } }
    return rec(rec)
}

fun main() {
    val factorial = fix<Int, Int> { self -> { n -> if (n == 0) 1 else n * self(n - 1) } }
    println(factorial(5))
}
