package com.alura.bytebank

import com.alura.bytebank.exception.InsufficientFoundsException
import com.alura.bytebank.tests.testDifferentAccounts

fun main() {
    println("main has started")
    testDifferentAccounts()
//    functionOne()
    println("main has ended")

}

fun functionOne() {
    println("functionOne has started")
    try {
        functionTwo()
    } catch (e: InsufficientFoundsException) {
        e.printStackTrace()
        println("insufficient founds excepction caught")
    }
    println("functionOne has stopped")
}

fun functionTwo() {
    println("functionTwo has started")
    for (i in 1..5) {
        println(i)
        val address = Any()
        throw InsufficientFoundsException()
    }
    println("functionTwo has stopped")
}














