package com.alura.bytebank.tests

import com.alura.bytebank.model.CheckingAccount
import com.alura.bytebank.model.SavingsAccount

fun accountBankTests() {
    val accountOne = CheckingAccount(client = "victor", accountNumber = 1000)
//    accountOne.client = "victor"
//    accountOne.accountNumber = 1000
    accountOne.depositMoney(amount = 300.0)

    val accountTwo = SavingsAccount(client = "cibelle", accountNumber = 2000)
//    accountTwo.client = "cibelle"
//    accountTwo.accountNumber = 2000
    accountTwo.depositMoney(amount = 3000.0)

    println(accountOne.clientAccount)
    println(accountOne.accountNumber)
    println(accountOne.balance)

    println("###################################")

    println(accountTwo.clientAccount)
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
    accountOne.withdrawMoney(amount = 250.0)
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
