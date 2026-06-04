class Sub1 { fun init() {} }
class Sub2 { fun init() {} }
class Sub3 { fun init() {} }

class Facade {
    private val s1 = Sub1()
    private val s2 = Sub2()
    private val s3 = Sub3()

    fun start(): String {
        s1.init()
        s2.init()
        s3.init()
        return "ready"
    }
}

fun main() {
    println(Facade().start())
}
