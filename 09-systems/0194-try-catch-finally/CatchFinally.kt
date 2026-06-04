fun main() {
    try {
        throw RuntimeException("boom")
    } catch (e: RuntimeException) {
        println("caught")
    } finally {
        println("cleanup")
    }
}
