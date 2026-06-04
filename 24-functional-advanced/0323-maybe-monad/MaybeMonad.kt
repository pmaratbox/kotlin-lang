sealed class Maybe<out A> {
    data class Some<A>(val value: A) : Maybe<A>()
    object None : Maybe<Nothing>()
}

fun <A, B> Maybe<A>.bind(f: (A) -> Maybe<B>): Maybe<B> = when (this) {
    is Maybe.Some -> f(value)
    is Maybe.None -> Maybe.None
}

fun <A> Maybe<A>.getOrElse(default: A): A = when (this) {
    is Maybe.Some -> value
    is Maybe.None -> default
}

fun main() {
    val present: Maybe<Int> = Maybe.Some(2)
        .bind { Maybe.Some(it + 3) }
        .bind { Maybe.Some(it * 2) }

    val absent: Maybe<Int> = (Maybe.None as Maybe<Int>)
        .bind { Maybe.Some(it + 3) }
        .bind { Maybe.Some(it * 2) }

    val a = present.getOrElse(-1)
    val b = if (absent is Maybe.None) "none" else absent.getOrElse(-1).toString()
    println("$a $b")
}
