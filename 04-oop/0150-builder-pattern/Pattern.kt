class Pizza(val size: String, val toppings: List<String>) {
    override fun toString() = "Pizza($size, ${toppings.joinToString(", ")})"

    class Builder {
        private var size: String = ""
        private val toppings = mutableListOf<String>()

        fun setSize(size: String) = apply { this.size = size }
        fun addTopping(topping: String) = apply { toppings.add(topping) }
        fun build() = Pizza(size, toppings)
    }
}

fun main() {
    val pizza = Pizza.Builder()
        .setSize("M")
        .addTopping("cheese")
        .build()
    println(pizza)
}
