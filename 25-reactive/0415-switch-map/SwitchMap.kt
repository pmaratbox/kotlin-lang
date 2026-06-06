import java.util.PriorityQueue

// Virtual-time scheduler: a priority queue of (time, seq, callback).
class Scheduler {
    private class Task(val time: Int, val seq: Int, val cb: () -> Unit) {
        var dead = false
    }

    private val queue = PriorityQueue<Task>(compareBy({ it.time }, { it.seq }))
    private var seq = 0
    var now = 0
        private set

    // schedule returns a cancel token that marks the callback dead.
    fun schedule(time: Int, cb: () -> Unit): () -> Unit {
        val task = Task(time, seq++, cb)
        queue.add(task)
        return { task.dead = true }
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

// A push-based Observable: subscribe wires a producer to an observer.
// subscribe returns a "subscription" = a cancel function for pending work.
class Observable(private val onSubscribe: (next: (Int) -> Unit) -> (() -> Unit)) {
    fun subscribe(next: (Int) -> Unit): () -> Unit = onSubscribe(next)
}

fun main() {
    val scheduler = Scheduler()

    // A timed source emits each value at now+delay; its subscription cancels
    // all of its still-pending scheduled emissions.
    fun timed(events: List<Pair<Int, Int>>) = Observable { next ->
        val tokens = events.map { (delay, value) ->
            scheduler.schedule(scheduler.now + delay) { next(value) }
        }
        ({ tokens.forEach { it() } })
    }

    // outer: 1 at t=10, 2 at t=20
    val outer = timed(listOf(10 to 1, 20 to 2))
    // inner(n): n at now+5, n*10 at now+30
    fun inner(n: Int) = timed(listOf(5 to n, 30 to n * 10))

    // switchMap: when a new outer value arrives, cancel the previous inner
    // subscription before starting the new one.
    fun switchMap(source: Observable, project: (Int) -> Observable) = Observable { next ->
        var innerCancel: (() -> Unit)? = null
        val outerCancel = source.subscribe { value ->
            innerCancel?.invoke()
            innerCancel = project(value).subscribe(next)
        }
        ({ innerCancel?.invoke(); outerCancel() })
    }

    switchMap(outer, ::inner).subscribe { println(it) }

    scheduler.run()
}
