data class C(val c: Int)
data class B(val b: C?)
data class A(val a: B?)

fun main() {
    val present = A(B(C(5)))
    val absent = A(B(null))
    val x = present.a?.b?.c ?: 0
    val y = absent.a?.b?.c ?: 0
    println("$x $y")
}
