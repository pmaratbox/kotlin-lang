interface Coffee {
    fun cost(): Int
}

class BaseCoffee : Coffee {
    override fun cost() = 2
}

class Milk(private val inner: Coffee) : Coffee {
    override fun cost() = inner.cost() + 1
}

class Sugar(private val inner: Coffee) : Coffee {
    override fun cost() = inner.cost() + 1
}

fun main() {
    val coffee: Coffee = Sugar(Milk(BaseCoffee()))
    println(coffee.cost())
}
