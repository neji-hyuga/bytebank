fun main() {
    println("welcome to bytebank:")

    val checkingAccountOne = CheckingAccount(
        client = "Peter",
        accountNumber = 1000
    )

    val savingsAccountOne = SavingsAccount(
        client = "Phill",
        accountNumber = 2000
    )

    checkingAccountOne.depositMoney(1000.0)
    savingsAccountOne.depositMoney(1000.0)

    println("checking account balance: ${checkingAccountOne.balance}")
    println("savings account balance: ${savingsAccountOne.balance}")

    checkingAccountOne.withdrawMoney(250.0)
    savingsAccountOne.withdrawMoney(250.0)

    println("checking account balance: ${checkingAccountOne.balance}")
    println("savings account balance: ${savingsAccountOne.balance}")

    checkingAccountOne.transferMoney(savingsAccountOne, 200.0)

    println("checking account balance: ${checkingAccountOne.balance}")
    println("savings account balance: ${savingsAccountOne.balance}")





}








