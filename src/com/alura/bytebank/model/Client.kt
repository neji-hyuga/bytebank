package com.alura.bytebank.model

class Client(
    var name: String,
    val id: String,
    var clientAddress: Address = Address(),
    protected val password: Int
) : LogIn {

    override fun checkLogIn(pass: Int): Boolean {
        if (this.password == pass) {
            return true
        }
        return false
    }
}