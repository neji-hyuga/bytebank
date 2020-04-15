package com.alura.bytebank.tests

import com.alura.bytebank.model.Director
import com.alura.bytebank.model.LoginSystem
import com.alura.bytebank.model.Manager

fun testDifferentLogIn(){
    val employeeOne = Director(
        name = "victor",
        id = "1",
        salary = 2000.0,
        password = 123,
        bonusExecutive = 200.0
    )

    val employeeTwo = Manager(
        name = "cibelle",
        id = "1",
        salary = 3000.0,
        password = 124
    )

    val logInSystem = LoginSystem()

    logInSystem.logIn(employeeOne, 123)
    logInSystem.logIn(employeeTwo, 123)

}
