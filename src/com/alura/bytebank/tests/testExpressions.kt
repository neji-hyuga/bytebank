package com.alura.bytebank.tests

import java.lang.NumberFormatException

fun testExpressions() {
    val income: String = "1.9"
    val amountReceived: Double? = try {
        income.toDouble()
    } catch (e: NumberFormatException) {
        println("conversion issue :(")
        e.printStackTrace()
        null
    }

    val amountPlusTaxes: Double? = if (amountReceived != null) {
        amountReceived + 0.1
    } else {
        null
    }

    if (amountPlusTaxes != null) {
        println("amount received: ${amountPlusTaxes}")
    } else {
        println("invalid conversion : |")
    }
}
