import java.util.PriorityQueue

class Scheduler {
    class Task(val time: Int, val seq: Long, val cb: () -> Unit) {
        var dead = false
    }

    private var clock = 0
    private var seq = 0L
    private val queue = PriorityQueue<Task>(compareBy({ it.time }, { it.seq }))

    fun schedule(delay: Int, cb: () -> Unit): Task {
        val task = Task(clock + delay, seq++, cb)
        queue.add(task)
        return task
    }

    fun cancel(task: Task) {
        task.dead = true
    }

    fun now(): Int = clock

    fun run() {
        while (queue.isNotEmpty()) {
            val task = queue.poll()
            if (task.dead) continue
            clock = task.time
            task.cb()
        }
    }
}

class Observable<T>(private val onSubscribe: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = onSubscribe(observer)
}

class Observer<T>(
    val next: (T) -> Unit,
    val complete: () -> Unit = {}
)

fun <A, B> flatMap(
    source: Observable<A>,
    project: (A) -> Observable<B>,
    observer: Observer<B>
) {
    source.subscribe(Observer(
        next = { value ->
            project(value).subscribe(Observer(next = observer.next))
        },
        complete = observer.complete
    ))
}

fun main() {
    val scheduler = Scheduler()

    // Outer schedules (10->1),(20->2).
    val outer = Observable<Int> { obs ->
        scheduler.schedule(10) { obs.next(1) }
        scheduler.schedule(20) { obs.next(2) }
    }

    // For each outer value n, inner schedules (now+5 -> n) and (now+30 -> n*10).
    val project: (Int) -> Observable<Int> = { n ->
        Observable { obs ->
            scheduler.schedule(5) { obs.next(n) }
            scheduler.schedule(30) { obs.next(n * 10) }
        }
    }

    flatMap(outer, project, Observer(next = { println(it) }))

    scheduler.run()
}
