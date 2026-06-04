import java.util.concurrent.CompletableFuture

fun main() {
    val result = CompletableFuture
        .supplyAsync { 5 }
        .thenApply { it * 2 }
        .thenApply { it + 1 }
        .get()
    println(result)
}
