import java.util.PriorityQueue

class Scheduler {
    data class Task(val time: Int, val seq: Int, val cb: () -> Unit, var dead: Boolean = false)

    private val queue = PriorityQueue<Task>(compareBy({ it.time }, { it.seq }))
    private var seq = 0
    var now = 0
        private set

    fun schedule(t: Int, cb: () -> Unit): Task {
        val task = Task(t, seq++, cb)
        queue.add(task)
        return task
    }

    fun cancel(token: Task) {
        token.dead = true
    }

    fun run() {
        while (queue.isNotEmpty()) {
            val task = queue.poll()
            if (task.dead) continue
            now = task.time
            task.cb()
        }
    }
}

class Observer(val next: (String) -> Unit)

fun throttle(scheduler: Scheduler, window: Int, source: (Observer) -> Unit): (Observer) -> Unit {
    return { observer ->
        var blockUntil = 0
        source(Observer { value ->
            if (scheduler.now >= blockUntil) {
                blockUntil = scheduler.now + window
                observer.next(value)
            }
        })
    }
}

fun main() {
    val scheduler = Scheduler()

    val source: (Observer) -> Unit = { observer ->
        val events = listOf("a" to 10, "b" to 20, "c" to 100, "d" to 110)
        for ((value, time) in events) {
            scheduler.schedule(time) { observer.next(value) }
        }
    }

    val throttled = throttle(scheduler, 30, source)
    throttled(Observer { value -> println(value) })

    scheduler.run()
}
