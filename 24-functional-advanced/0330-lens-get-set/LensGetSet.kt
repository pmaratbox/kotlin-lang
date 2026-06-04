data class Inner(val b: Int)
data class Outer(val a: Inner)

class Lens<S, A>(val get: (S) -> A, val set: (S, A) -> S)

fun main() {
    val bLens = Lens<Outer, Int>(
        get = { it.a.b },
        set = { s, v -> s.copy(a = s.a.copy(b = v)) }
    )

    val original = Outer(Inner(1))
    val got = bLens.get(original)
    val updated = bLens.set(original, 2)
    println("$got ${bLens.get(updated)}")
}
