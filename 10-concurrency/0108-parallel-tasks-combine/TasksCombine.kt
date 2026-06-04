import java.util.concurrent.CompletableFuture

fun main() {
    val a = CompletableFuture.supplyAsync { 10 }
    val b = CompletableFuture.supplyAsync { 20 }
    val combined = a.thenCombine(b) { x, y -> x + y }
    println(combined.get())
}
