fun main() {
    val bit = 1
    val set = 0 or (1 shl bit)
    val clear = 2 and (1 shl bit).inv()
    val toggle = 0 xor (1 shl bit)
    println("$set $clear $toggle")
}
