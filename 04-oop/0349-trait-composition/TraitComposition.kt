interface A {
    fun doA() = print("a")
}

interface B {
    fun doB() = print("b")
}

class AB : A, B

fun main() {
    val ab = AB()
    ab.doA()
    print(" ")
    ab.doB()
    println()
}
