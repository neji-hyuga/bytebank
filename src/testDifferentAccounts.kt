fun testDifferentAccounts() {
    val checkingAccountOne = CheckingAccount(
        client = "Peter",
        accountNumber = 1000
    )

    val savingsAccountOne = SavingsAccount(
        client = "Phill",
        accountNumber = 2000
    )

    val salaryAccountOne = SalaryAccount(
        client = "Sarah",
        accountNumber = 3000
    )

    checkingAccountOne.depositMoney(1000.0)
    savingsAccountOne.depositMoney(1000.0)
    salaryAccountOne.depositMoney(1020.0)

    println("checking account balance: ${checkingAccountOne.balance}")
    println("savings account balance: ${savingsAccountOne.balance}")
    println("salary account balance: ${salaryAccountOne.balance}")

    checkingAccountOne.withdrawMoney(250.0)
    savingsAccountOne.withdrawMoney(250.0)
    salaryAccountOne.withdrawMoney(200.0)

    println("checking account balance: ${checkingAccountOne.balance}")
    println("savings account balance: ${savingsAccountOne.balance}")
    println("salary account balance: ${salaryAccountOne.balance}")

    checkingAccountOne.transferMoney(savingsAccountOne, 200.0)
    

    println("checking account balance: ${checkingAccountOne.balance}")
    println("savings account balance: ${savingsAccountOne.balance}")
}