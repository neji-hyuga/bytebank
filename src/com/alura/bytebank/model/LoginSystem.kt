package com.alura.bytebank.model

class LoginSystem {

    fun logIn(admin: LogIn, password: Int){
        if(admin.checkLogIn(password)){
            println("welcome to bytebank")
        } else{
            println("you're not logged in")
        }
    }
}