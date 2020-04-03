fun testCicles() {
    var i = 0
    while (i < 5) {

        val clientName: String = "victor $i"
        val accountNumber: Int = 1000 + i
        var balance: Double = i + 10.0
        balance = 100 + 2.0
        balance += 200
        balance -= 1000
        println()
        println("account holder: $clientName")
        println("account number: $accountNumber")
        println("account balance: $balance")
        println()
        i++
    }
}