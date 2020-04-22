package com.alura.bytebank.model

// example of constructor in Kotlin
abstract class Account(
    var accountHolder: Client,
    val accountNumber: Int
) : LogIn { // if account holder was VAL you can use "LogIn by accountHolder"
    var balance = 0.0
        protected set //  it's outside the constructor because it isn't a mandatory information

    companion object { // example of "object declaration" and "companion object"
        var counter = 0
            private set
    }

    init {
        println("creating account...")
        counter++
    }

    //        examples of GETTERS and SETTERS in Kotlin
//        get(){return field}
//
//        set(amount){
//            field = amount
//        }

    override fun checkLogIn(pass: Int): Boolean {
        return accountHolder.checkLogIn(pass) //example of DELEGATION
    }

    fun depositMoney(amount: Double) {
        if (amount > 0) {
            this.balance += amount
        }
    }


    abstract fun withdrawMoney(amount: Double)
}

class CheckingAccount(
    accountHolder: Client,
    accountNumber: Int
) : AccountWithTransfer(
    accountHolder = accountHolder,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double) {
        val amountWithTaxes = amount + 0.1
        if (this.balance >= amountWithTaxes) balance -= amountWithTaxes
    }
}

class SavingsAccount(
    accountHolder: Client,
    accountNumber: Int
) : AccountWithTransfer(
    accountHolder = accountHolder,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double) {
        if (this.balance >= amount) {
            balance -= amount
        }
    }
}

class SalaryAccount(
    accountHolder: Client,
    accountNumber: Int

) : Account(
    accountHolder = accountHolder,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double) {
        if (this.balance >= amount) {
            this.balance -= amount
        }
    }
}