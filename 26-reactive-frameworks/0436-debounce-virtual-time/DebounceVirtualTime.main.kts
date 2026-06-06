@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.runTest

@OptIn(FlowPreview::class, kotlinx.coroutines.ExperimentalCoroutinesApi::class)
fun run() = runTest {
    val out = mutableListOf<String>()
    val src = flow {
        delay(10); emit("a")
        delay(10); emit("b")
        delay(80); emit("c")
        delay(40) // quiet gap after c so trailing value is emitted
    }
    src.debounce(30).collect { out.add(it) }
    println(out.joinToString("\n"))
}
run()
