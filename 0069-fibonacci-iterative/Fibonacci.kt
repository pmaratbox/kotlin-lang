fun main() {
    var a = 0
    var b = 1
    val nums = mutableListOf<String>()
    repeat(7) {
        nums.add(a.toString())
        val t = a + b
        a = b
        b = t
    }
    println(nums.joinToString(" "))
}
