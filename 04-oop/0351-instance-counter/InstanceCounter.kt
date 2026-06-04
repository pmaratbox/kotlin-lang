class Widget {
    companion object {
        var count = 0
            private set
    }

    init {
        count++
    }
}

fun main() {
    Widget()
    Widget()
    Widget()
    println(Widget.count)
}
