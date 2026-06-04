sealed interface Expr
data class Num(val value: Int) : Expr
data class Add(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Add -> eval(e.left) + eval(e.right)
}

fun main() {
    println(eval(Add(Num(1), Num(2))))
}
