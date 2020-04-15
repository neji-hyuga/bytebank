package com.alura.bytebank

import com.alura.bytebank.model.Address

fun main() {


    val address = Address()

    val objectOne: Any = Any()

    printIt(objectOne)

    printIt(1)
    printIt(1.0)
    printIt(address)

    val test: Any = printIt(address)
    println(test)
}

fun printIt(value: Any) : Any{
    println(value)
    return (value)


}











