package com.alura.bytebank.tests

fun testConditions(balance: Double) {
    when {
        balance > 0.0 -> println("your balance is positive")
        balance == 0.0 -> println("your balance is 0.0")
        else -> println("your account is negative")
    }
}