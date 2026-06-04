class LruCache(private val capacity: Int) {
    private val map = LinkedHashMap<Int, Int>()

    fun get(key: Int): Int {
        val value = map.remove(key) ?: return -1
        map[key] = value
        return value
    }

    fun put(key: Int, value: Int) {
        map.remove(key)
        if (map.size >= capacity) {
            map.remove(map.keys.first())
        }
        map[key] = value
    }
}

fun main() {
    val cache = LruCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    cache.get(1)
    cache.put(3, 3)
    println("${cache.get(1)} ${cache.get(2)}")
}
