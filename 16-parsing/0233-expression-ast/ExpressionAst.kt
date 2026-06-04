sealed interface Expr {
    fun eval(): Int
}

data class Num(val value: Int) : Expr {
    override fun eval() = value
}

data class Add(val left: Expr, val right: Expr) : Expr {
    override fun eval() = left.eval() + right.eval()
}

data class Mul(val left: Expr, val right: Expr) : Expr {
    override fun eval() = left.eval() * right.eval()
}

fun main() {
    // 1 + 2 * 3
    val ast: Expr = Add(Num(1), Mul(Num(2), Num(3)))
    println(ast.eval())
}
