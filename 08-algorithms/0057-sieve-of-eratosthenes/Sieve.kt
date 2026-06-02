fun main() {
    val n = 10
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    var i = 2
    while (i * i <= n) {
        if (isPrime[i]) {
            var j = i * i
            while (j <= n) {
                isPrime[j] = false
                j += i
            }
        }
        i++
    }

    val primes = (2..n).filter { isPrime[it] }
    println(primes.joinToString(" "))
}
