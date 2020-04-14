package com.alura.bytebank.model

abstract class Admin(
    name: String,
    id: String,
    salary: Double,
    protected val password: Int
): Employee(
    name = name,
    id = id,
    salary = salary
), LogIn {

    override fun checkLogIn(pass: Int): Boolean {
        if (this.password == pass) {
            return true
        }
        return false


    }


}