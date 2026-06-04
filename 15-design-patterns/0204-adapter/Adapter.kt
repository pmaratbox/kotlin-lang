class CelsiusSensor(val celsius: Int)

interface Fahrenheit {
    fun fahrenheit(): Int
}

class CelsiusToFahrenheit(private val source: CelsiusSensor) : Fahrenheit {
    override fun fahrenheit() = source.celsius * 9 / 5 + 32
}

fun main() {
    val adapter: Fahrenheit = CelsiusToFahrenheit(CelsiusSensor(100))
    println(adapter.fahrenheit())
}
