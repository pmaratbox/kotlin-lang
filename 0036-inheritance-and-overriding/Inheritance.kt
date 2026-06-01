open class Animal {
    open fun speak(): String = "some sound"
}

class Dog : Animal() {
    override fun speak(): String = "Woof"
}

fun main() {
    println("animal: ${Animal().speak()}")
    println("dog: ${Dog().speak()}")
}
