package com.alura.bytebank.tests

import com.alura.bytebank.model.CheckingAccount
import com.alura.bytebank.model.SavingsAccount

fun testCopiesAndReferences() {
    val numberA = 10
    var numberB = numberA
    numberB++

    println("numberA $numberA")
    println("numberB $numberB")

    val accountThree = SavingsAccount(client = "ewandro", accountNumber = 3000)
//    accountThree.client = "ewandro"
    println("hello! ${accountThree.clientAccount}")

    var accountFour = CheckingAccount(client = "tâninha", accountNumber = 4000)
//    accountFour.client = "tania"
    println("hello! ${accountFour.clientAccount}")
}