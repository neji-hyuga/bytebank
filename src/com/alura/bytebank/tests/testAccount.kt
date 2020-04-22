package com.alura.bytebank.tests

import com.alura.bytebank.exception.InsufficientFoundsException
import com.alura.bytebank.exception.NotLoggedInException
import com.alura.bytebank.model.CheckingAccount
import com.alura.bytebank.model.Client
import com.alura.bytebank.model.SavingsAccount

fun testAccount() {

    val clientOne = Client(name = "victor", id = "365.697.358.11", password = 1234)

    val accountOne = CheckingAccount(accountHolder = clientOne, accountNumber = 1000)
//    accountOne.client = "victor"
//    accountOne.accountNumber = 1000
    accountOne.depositMoney(amount = 300.0)

    val clientTwo = Client(name = "cibelle", id = "387.787.238.23", password = 1234)

    val accountTwo = SavingsAccount(accountHolder = clientTwo, accountNumber = 2000)
//    accountTwo.client = "cibelle"
//    accountTwo.accountNumber = 2000
    accountTwo.depositMoney(amount = 3000.0)

    println(accountOne.accountHolder)
    println(accountOne.accountNumber)
    println(accountOne.balance)

    println("###################################")

    println(accountTwo.accountHolder)
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
//    if (accountTwo.transferMoney(targetAccount = accountOne, amount = 3000.0)) { // replaced by TRY
//        println("transfer completed!")
//    } else {
//        println("this transfer cannot be done")
//    }
//
//    println("account 1000 new balance: ${accountOne.balance}")
//    println("account 2000 new balance: ${accountTwo.balance}")

    try {
        accountOne.transferMoney(targetAccount = accountTwo, amount = 100.0, pass = 1234)
        println("transfer suceeded")
    } catch (e: InsufficientFoundsException){
        println("you have insufficient founds")
        e.printStackTrace()
    } catch (e: NotLoggedInException){
        println("you're not logged in")
        println("please log in and try again")
        e.printStackTrace()
    } catch (e: Exception){
        println("Unknown error")
        e.printStackTrace()
    }






}
