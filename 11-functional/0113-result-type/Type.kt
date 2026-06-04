sealed class Result
data class Ok(val value: Int) : Result()
data class Err(val msg: String) : Result()

fun safeDiv(a: Int, b: Int): Result =
    if (b == 0) Err("divide by zero") else Ok(a / b)

fun show(r: Result): String = when (r) {
    is Ok -> "ok: ${r.value}"
    is Err -> "err: ${r.msg}"
}

fun main() {
    println(show(safeDiv(10, 2)))
    println(show(safeDiv(1, 0)))
}
