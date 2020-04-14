package com.alura.bytebank.tests

import com.alura.bytebank.model.CalculateBonus
import com.alura.bytebank.model.Director
import com.alura.bytebank.model.Internship
import com.alura.bytebank.model.Manager

fun testEmployees() {
    val employeeOne = Internship(
        name = "Sara",
        id = "7000",
        salary = 1000.0
    )

    println("################################")
    println("welcome ${employeeOne.name}.")
    println("yoru id: ${employeeOne.id}")
    println("your salary: ${employeeOne.salary}")
    println("your anual bonus: ${employeeOne.bonus}")
    println("################################")
    println("################################")
    println()

    val employeeTwo = Manager(
        name = "Steve",
        id = "8000",
        salary = 3000.0,
        password = 1234
    )

    println("welcome ${employeeTwo.name}.")
    println("yoru id: ${employeeTwo.id}")
    println("your salary: ${employeeTwo.salary}")
    println("your anual bonus: ${employeeTwo.bonus}")
    println("################################")
    println("################################")

    if (employeeTwo.checkLogIn(1234)) {
        println("you're logged in")
    } else {
        println("forgot your password?")
    }

    val employeeThree = Director(
        name = "Phill",
        id = "9000",
        salary = 5000.0,
        password = 4321,
        bonusExecutive = 800.0
    )

    println("welcome ${employeeThree.name}.")
    println("yoru id: ${employeeThree.id}")
    println("your salary: ${employeeThree.salary}")
    println("your executive bonus: ${employeeThree.bonusExecutive}")
    println("your anual bonus: ${employeeThree.bonus}")
    println("################################")
    println("################################")

    if (employeeThree.checkLogIn(4321)) {
        println("you're logged in")
    } else {
        println("forgot your password?")
    }

    val employeeFour = Internship(
        name = "Peter",
        id = "7500",
        salary = 500.0
    )

    println("welcome ${employeeFour.name}.")
    println("yoru id: ${employeeFour.id}")
    println("your salary: ${employeeFour.salary}")
    println("your anual bonus: ${employeeFour.bonus}")

    println("################################")
    println("################################")


    val bonusCalculator = CalculateBonus()
    bonusCalculator.registerEmployee(employeeOne)
    bonusCalculator.registerEmployee(employeeTwo)
    bonusCalculator.registerEmployee(employeeThree)
    bonusCalculator.registerEmployee(employeeFour)

    println("################################")
    println("total bonuses: ${bonusCalculator.totalBonus}")
}