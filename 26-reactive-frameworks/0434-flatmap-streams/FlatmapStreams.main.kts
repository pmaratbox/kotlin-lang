@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.runTest

@OptIn(FlowPreview::class, kotlinx.coroutines.ExperimentalCoroutinesApi::class)
fun run() = runTest {
    val out = mutableListOf<Int>()

    // outer emits 1@10, 2@20 (virtual time)
    val outer = flow {
        delay(10); emit(1)
        delay(10); emit(2)
    }

    // each outer value n -> inner emitting n at +5 and n*10 at +30
    outer.flatMapMerge { n ->
        flow {
            delay(5); emit(n)
            delay(25); emit(n * 10)
        }
    }.collect { out.add(it) }

    println(out.joinToString("\n"))
}

run()
