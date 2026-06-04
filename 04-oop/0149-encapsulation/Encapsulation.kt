class Account(private var balance: Int) {
    fun deposit(amount: Int) {
        balance += amount
    }

    fun balance(): Int = balance
}

fun main() {
    val account = Account(100)
    account.deposit(50)
    println(account.balance())
}
