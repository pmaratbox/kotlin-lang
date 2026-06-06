import java.util.PriorityQueue

// A scheduled callback; cancellable via its `dead` flag.
class Task(val time: Int, val seq: Int, val cb: () -> Unit) {
    var dead = false
}

// A virtual-time scheduler: a priority queue of (time, seq, callback).
class Scheduler {
    private val queue = PriorityQueue<Task>(compareBy({ it.time }, { it.seq }))
    private var seq = 0
    var now = 0
        private set

    fun schedule(t: Int, cb: () -> Unit): Task {
        val task = Task(t, seq++, cb)
        queue.add(task)
        return task
    }

    fun cancel(token: Task?) {
        token?.dead = true
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

// A push-based observer: next/complete closures.
class Observer<T>(val next: (T) -> Unit, val complete: () -> Unit)

// debounce(window): emit a value only after a quiet gap of `window` ticks
// with no newer value. On each value, cancel any pending emit and schedule
// this value to fire at now+window.
fun debounce(
    scheduler: Scheduler,
    window: Int,
    out: Observer<String>,
): Observer<String> {
    var pending: Task? = null
    return Observer(
        next = { value ->
            scheduler.cancel(pending)
            pending = scheduler.schedule(scheduler.now + window) { out.next(value) }
        },
        complete = { out.complete() },
    )
}

fun main() {
    val scheduler = Scheduler()
    val out = Observer<String>(next = { println(it) }, complete = {})
    val debounced = debounce(scheduler, window = 30, out = out)

    // Source schedules ("a"@10),("b"@20),("c"@100), then ends at @100.
    scheduler.schedule(10) { debounced.next("a") }
    scheduler.schedule(20) { debounced.next("b") }
    scheduler.schedule(100) { debounced.next("c") }
    scheduler.schedule(100) { debounced.complete() }

    scheduler.run()
}
