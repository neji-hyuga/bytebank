package com.alura.bytebank.tests

import com.alura.bytebank.model.CheckingAccount
import com.alura.bytebank.model.Client
import com.alura.bytebank.model.SavingsAccount

fun testCopiesAndReferences() {
    val numberA = 10
    var numberB = numberA
    numberB++

    println("numberA $numberA")
    println("numberB $numberB")

    val clientThree = Client(name = "ewandro", id = "365.697.358.11", password = 1234)

    val accountThree = SavingsAccount(accountHolder = clientThree, accountNumber = 3000)
//    accountThree.client = "ewandro"
    println("hello! ${accountThree.accountHolder}")

    //exemplo de instância de objeto (Client) na instância de outro objeto (CheckingAccount)
    var accountFour = CheckingAccount(Client(
        name = "tâninha",
        id = "365.697.358.11",
        password = 1234
    ), accountNumber = 4000)
//    accountFour.client = "tania"
    println("hello! ${accountFour.accountHolder}")
}