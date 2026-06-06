import java.util.PriorityQueue

class Scheduler {
    class Task(val time: Int, val seq: Long, val cb: () -> Unit) {
        var dead = false
    }

    private var seq = 0L
    private val queue = PriorityQueue<Task>(compareBy({ it.time }, { it.seq }))
    var now = 0
        private set

    fun schedule(time: Int, cb: () -> Unit): Task {
        val task = Task(time, seq++, cb)
        queue.add(task)
        return task
    }

    fun cancel(task: Task) {
        task.dead = true
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

class Observable<T>(private val onSubscribe: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = onSubscribe(observer)
}

class Observer<T>(
    val next: (T) -> Unit,
    val error: (Throwable) -> Unit = {},
    val complete: () -> Unit = {}
)

fun timed(scheduler: Scheduler, events: List<Pair<Int, Int>>): Observable<Int> =
    Observable { observer ->
        for ((time, value) in events) {
            scheduler.schedule(time) { observer.next(value) }
        }
    }

fun <A, B> combineLatest(a: Observable<A>, b: Observable<B>, sink: (A, B) -> Unit) {
    var latestA: A? = null
    var hasA = false
    var latestB: B? = null
    var hasB = false

    fun emit() {
        if (hasA && hasB) {
            @Suppress("UNCHECKED_CAST")
            sink(latestA as A, latestB as B)
        }
    }

    a.subscribe(Observer({ v -> latestA = v; hasA = true; emit() }))
    b.subscribe(Observer({ v -> latestB = v; hasB = true; emit() }))
}

fun main() {
    val scheduler = Scheduler()
    val a = timed(scheduler, listOf(1 to 1, 3 to 2))
    val b = timed(scheduler, listOf(2 to 10))

    combineLatest(a, b) { x, y -> println("($x, $y)") }

    scheduler.run()
}
