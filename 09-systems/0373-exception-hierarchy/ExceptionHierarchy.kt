open class BaseError(message: String) : Exception(message)
class SpecificError(message: String) : BaseError(message)

fun main() {
    try {
        throw SpecificError("boom")
    } catch (e: BaseError) {
        println("caught base")
    }
}
