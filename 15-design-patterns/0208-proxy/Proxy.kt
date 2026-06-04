interface Subject {
    fun request(): String
}

class RealSubject : Subject {
    override fun request() = "loaded"
}

class VirtualProxy : Subject {
    private var real: RealSubject? = null

    override fun request(): String {
        val r = real ?: RealSubject().also { real = it }
        return r.request()
    }
}

fun main() {
    val proxy: Subject = VirtualProxy()
    println(proxy.request())
}
