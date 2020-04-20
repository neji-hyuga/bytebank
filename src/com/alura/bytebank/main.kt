package com.alura.bytebank

import com.alura.bytebank.model.Address
import java.lang.ClassCastException

fun main() {
    println("main has started")
    functionOne()
    println("main has ended")
}

fun functionOne() {
    println("functionOne has started")
    try {
        functionTwo()
    } catch (e: ClassCastException){
        e.printStackTrace()
        println("class cast excepction caught")
    }
    println("functionOne has stopped")
}

fun functionTwo() {
    println("functionTwo has started")
    for (i in 1..5){
        println(i)
        val address = Any()
        address as Address
    }
    println("functionTwo has stopped")
}













