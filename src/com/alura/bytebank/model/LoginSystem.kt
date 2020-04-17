package com.alura.bytebank.model

class LoginSystem {

    fun logIn(admin: LogIn, password: Int) {
        if (admin.checkLogIn(password)) {
            println("welcome to bytebank")
        } else {
            println("you're not logged in")
        }

        // WHEN plus IF to possibility more options inside a function
        when (admin) {
            is Admin -> {
                println("admin options")
            }
            is Employee -> {
                println("standard options")
            }
            else -> {
                println("regular options")
            }
        }
    }
}