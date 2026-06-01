fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { x -> f(g(x)) }

fun main() {
    val inc = { x: Int -> x + 1 }
    val twice = { x: Int -> x * 2 }
    println(compose(inc, twice)(3))
}
