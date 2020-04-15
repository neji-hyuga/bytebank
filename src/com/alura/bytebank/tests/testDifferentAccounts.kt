package com.alura.bytebank.tests

import com.alura.bytebank.model.*

fun testDifferentAccounts() {
    val checkingAccountOne = CheckingAccount(
        accountHolder = Client(
            name = "Peter",
            id = "365.697.358.11",
            password = 1234,
            clientAddress = Address(
                number = 23,
                street = "Lascelles BLVD",
                municipality = "Toronto",
                province = "ON",
                postalCode = "M4V 2B9"
            )
        ),
        accountNumber = 1000
    )

    val savingsAccountOne = SavingsAccount(
        accountHolder = Client(
            name = "Phill",
            id = "365.697.358.11",
            password = 1234
        ),
        accountNumber = 2000
    )

    val salaryAccountOne = SalaryAccount(
        accountHolder = Client(
            name = "Roxane",
            id = "365.697.358.11",
            password = 1234
        ),
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

    println("account holder name: ${checkingAccountOne.accountHolder.name}")
    println("account holder address: ${checkingAccountOne.accountHolder.clientAddress.number} ${checkingAccountOne.accountHolder.clientAddress.street} ${checkingAccountOne.accountHolder.clientAddress.postalCode}" )

}