fun main() {
    println("welcome to bytebank")

    var i =0
    while (i<5){

        val clientName: String = "victor $i"
        val accountNumber: Int = 1000 + i
        var balance: Double = i + 10.0
//        balance = 100 + 2.0
//        balance += 200
//        balance -= 1000
        println()
        println("account holder: $clientName")
        println("account number: $accountNumber")
        println("account balance: $balance")
        println()
        i++
    }

    //testConditions(balance)

}

fun testConditions(balance: Double) {
    when {
        balance > 0.0 -> println("your balance is positive")
        balance == 0.0 -> println("your balance is 0.0")
        else -> println("your account is negative")
    }
}