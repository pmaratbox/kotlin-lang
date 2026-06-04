sealed class Either<out L, out R> {
    data class Left<L>(val value: L) : Either<L, Nothing>()
    data class Right<R>(val value: R) : Either<Nothing, R>()
}

fun <L, R, R2> Either<L, R>.bind(f: (R) -> Either<L, R2>): Either<L, R2> = when (this) {
    is Either.Left -> this
    is Either.Right -> f(value)
}

fun divide(a: Int, b: Int): Either<String, Int> =
    if (b == 0) Either.Left("err") else Either.Right(a / b)

fun main() {
    val ok = divide(8, 2).bind { divide(it, 2) }   // 8/2=4, 4/2=2
    val bad = divide(8, 0).bind { divide(it, 2) }   // err short-circuits

    val a = (ok as Either.Right).value
    val b = (bad as Either.Left).value
    println("$a $b")
}
