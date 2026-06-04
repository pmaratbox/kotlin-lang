fun main() {
    var a = 3
    var b = 5
    a = a xor b
    b = b xor a
    a = a xor b
    println("$a $b")
}
