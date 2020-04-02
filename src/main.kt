fun main() {
    println("welcome to bytebank:")

    val accountOne = Account(client = "victor",accountNumber = 1000)
//    accountOne.client = "victor"
//    accountOne.accountNumber = 1000
    accountOne.depositMoney(amount = 300.0)

    val accountTwo = Account(client = "cibelle", accountNumber = 2000)
//    accountTwo.client = "cibelle"
//    accountTwo.accountNumber = 2000
    accountTwo.depositMoney(amount = 3000.0)

    println(accountOne.client)
    println(accountOne.accountNumber)
    println(accountOne.balance)

    println("###################################")

    println(accountTwo.client)
    println(accountTwo.accountNumber)
    println(accountTwo.balance)

    println("###################################")

    println("depositing money ...")
accountOne.depositMoney(amount = 50.0)
    println("your new balance is: ${accountOne.balance}")

    println("depositing money...")
    accountTwo.depositMoney(amount = 150.0)
    println("your new balance is: ${accountTwo.balance}")

    println("###################################")

    println("withdrawing money...")
    accountOne.withdrawMoney(amount = 100.0)
    println("your new balance is: ${accountOne.balance}")

    println("withdrawing money...")
    accountTwo.withdrawMoney(amount = 70.0)
    println("your new balance is: ${accountTwo.balance}")

    println("###################################")

    println("withdrawing money...")
    accountOne.withdrawMoney( amount = 250.0)
    println("your new balance is: ${accountOne.balance}")

    println("withdrawing money...")
    accountTwo.withdrawMoney(amount = 2076.0)
    println("your new balance is: ${accountTwo.balance}")

    println("###################################")

    println("send money...")

//    Example of LABELS in kotlin
//    labels can be used in functions or in new objects
    if (accountTwo.transferMoney(targetAccount = accountOne, amount = 3000.0)) {
        println("transfer completed!")
    } else {
        println("this transfer cannot be done")
    }

    println("account 1000 new balance: ${accountOne.balance}")
    println("account 2000 new balance: ${accountTwo.balance}")

}

// example of constructor in Kotlin
class Account(
    var client: String,
    val accountNumber: Int
) {
    var balance = 0.0
        private set

    //        examples of GETTERS and SETTERS in Kotlin
//        get(){return field}
//
//        set(amount){
//            field = amount
//        }

    fun depositMoney(amount: Double) {
        if (amount > 0) {
            this.balance += amount
        }
    }


    fun withdrawMoney(amount: Double) {
        if (this.balance >= amount) {
            balance -= amount
        }
    }

    fun transferMoney(targetAccount: Account, amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            targetAccount.depositMoney(amount)
            return true
        }
        return false
    }


}


fun testCopiesAndReferences() {
    val numberA = 10
    var numberB = numberA
    numberB++

    println("numberA $numberA")
    println("numberB $numberB")

    val accountThree = Account(client = "ewandro", accountNumber =  3000)
//    accountThree.client = "ewandro"
    println("hello! ${accountThree.client}")

    var accountFour = Account(client = "tâninha", accountNumber =  4000)
//    accountFour.client = "tania"
    println("hello! ${accountFour.client}")
}

fun testConditions(balance: Double) {
    when {
        balance > 0.0 -> println("your balance is positive")
        balance == 0.0 -> println("your balance is 0.0")
        else -> println("your account is negative")
    }
}

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