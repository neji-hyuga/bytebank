package com.alura.bytebank.model

abstract class Employee(
    val name: String,
    val id: String,
    val salary: Double
) {

    //    exemple of single expression function
//    abstract open val bonus: Double
//        get() = salary * 0.1

    abstract val bonus: Double

}