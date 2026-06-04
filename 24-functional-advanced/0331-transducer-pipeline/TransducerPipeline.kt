// A transducer transforms a reducing step into another reducing step.
typealias Reducer<A, R> = (R, A) -> R
typealias Transducer<A, B> = (Reducer<B, Any?>) -> Reducer<A, Any?>

fun <A, B> mapping(f: (A) -> B): Transducer<A, B> =
    { step -> { acc, x -> step(acc, f(x)) } }

fun <A> filtering(pred: (A) -> Boolean): Transducer<A, A> =
    { step -> { acc, x -> if (pred(x)) step(acc, x) else acc } }

fun main() {
    val mapInc = mapping<Int, Int> { it + 1 }
    val keepEven = filtering<Int> { it % 2 == 0 }

    @Suppress("UNCHECKED_CAST")
    val collect: Reducer<Int, Any?> = { acc, x -> (acc as MutableList<Int>).also { it.add(x) } }
    val xf = mapInc(keepEven(collect))

    val result = listOf(1, 2, 3, 4).fold(mutableListOf<Int>() as Any?, xf) as MutableList<Int>
    println(result.joinToString(" "))
}
