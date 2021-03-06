package com.alura.bytebank.tests

import com.alura.bytebank.model.Client
import com.alura.bytebank.model.Director
import com.alura.bytebank.model.LoginSystem
import com.alura.bytebank.model.Manager

fun testLogIn() {
    val managerOne = Manager(
        name = "Jack",
        id = "1500",
        salary = 2000.0,
        password = 1234
    )
    val directorOne = Director(
        name = "Peter",
        id = "2500",
        salary = 4000.0,
        password = 4321,
        bonusExecutive = 1000.0
    )

    val clientOne = Client(
        name = "Juarez",
        id = "9000",
        password = 12345
    )

    val loginSystem = LoginSystem()
    loginSystem.logIn(directorOne, 4321)
    loginSystem.logIn(managerOne, 1234)
    loginSystem.logIn(clientOne, 12345)


}
