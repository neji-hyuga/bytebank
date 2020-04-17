package com.alura.bytebank

import com.alura.bytebank.model.Address

fun main() {


    val addressOne = Address(
        number = 23,
        street = "Lascelles BLVD",
        municipality = "Toronto",
        province = "ON",
        postalCode = "M4V2B9",
        unit = "1804"
    )
    val addressTwo = Address(
        number = 107,
        street = "McCurdy DR",
        municipality = "Tottenham",
        province = "ON",
        postalCode = "L0G1W0",
        unit = "A"
    )

    val objectOne: Any = Any()

    printIt(objectOne)

    printIt(1)
    printIt(1.0)
    printIt(addressOne)
    printIt(addressTwo)

    println(addressOne.equals(addressTwo))
    println(addressOne.equals(addressOne))

    println(addressOne.hashCode())
    println(addressTwo.hashCode())



//    val test: Any = printIt(addressTwo)
//    println(test)
}
//in kotlin everything is an object, even an unit,
//it's a object of something null
fun printIt(value: Any) : Any{
    println(value)
    return (value)
}











