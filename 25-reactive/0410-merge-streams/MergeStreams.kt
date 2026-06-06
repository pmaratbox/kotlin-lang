import java.util.PriorityQueue

// --- Virtual-time scheduler --------------------------------------------------

class Scheduler {
    data class Task(val time: Int, val seq: Int, val cb: () -> Unit) {
        var dead = false
    }

    private val queue = PriorityQueue<Task>(compareBy({ it.time }, { it.seq }))
    private var seq = 0
    var clock = 0
        private set

    fun schedule(time: Int, cb: () -> Unit): Task {
        val task = Task(time, seq++, cb)
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
            clock = task.time
            task.cb()
        }
    }
}

// --- Minimal push-based Observable -------------------------------------------

class Observer<T>(
    val next: (T) -> Unit,
    val error: (Throwable) -> Unit = {},
    val complete: () -> Unit = {},
)

class Observable<T>(private val onSubscribe: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = onSubscribe(observer)
}

// A timed source: emits each (time, value) by scheduling on the scheduler.
fun timed(scheduler: Scheduler, events: List<Pair<Int, Int>>): Observable<Int> =
    Observable { observer ->
        for ((time, value) in events) {
            scheduler.schedule(time) { observer.next(value) }
        }
    }

// merge: subscribe to both sources onto the same observer.
fun merge(a: Observable<Int>, b: Observable<Int>): Observable<Int> =
    Observable { observer ->
        a.subscribe(observer)
        b.subscribe(observer)
    }

fun main() {
    val scheduler = Scheduler()
    val a = timed(scheduler, listOf(10 to 1, 30 to 3, 50 to 5))
    val b = timed(scheduler, listOf(20 to 2, 40 to 4, 60 to 6))

    merge(a, b).subscribe(Observer(next = { println(it) }))

    scheduler.run()
}
