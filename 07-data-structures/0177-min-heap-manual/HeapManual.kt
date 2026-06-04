class MinHeap {
    private val data = mutableListOf<Int>()

    fun push(value: Int) {
        data.add(value)
        var i = data.size - 1
        while (i > 0) {
            val parent = (i - 1) / 2
            if (data[parent] <= data[i]) break
            data[parent] = data[i].also { data[i] = data[parent] }
            i = parent
        }
    }

    fun pop(): Int {
        val top = data[0]
        val last = data.removeAt(data.size - 1)
        if (data.isNotEmpty()) {
            data[0] = last
            var i = 0
            while (true) {
                val l = 2 * i + 1
                val r = 2 * i + 2
                var smallest = i
                if (l < data.size && data[l] < data[smallest]) smallest = l
                if (r < data.size && data[r] < data[smallest]) smallest = r
                if (smallest == i) break
                data[i] = data[smallest].also { data[smallest] = data[i] }
                i = smallest
            }
        }
        return top
    }

    fun isNotEmpty() = data.isNotEmpty()
}

fun main() {
    val heap = MinHeap()
    for (v in listOf(3, 1, 2)) heap.push(v)
    val out = mutableListOf<Int>()
    while (heap.isNotEmpty()) out.add(heap.pop())
    println(out.joinToString(" "))
}
