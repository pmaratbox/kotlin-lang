fun main() {
    val hour = 10
    val minute = 45
    val total = hour * 60 + minute + 90
    val h = (total / 60) % 24
    val m = total % 60
    println("%02d:%02d".format(h, m))
}
