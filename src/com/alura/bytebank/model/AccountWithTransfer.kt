package com.alura.bytebank.model

import com.alura.bytebank.exception.InsufficientFoundsException
import com.alura.bytebank.exception.NotLoggedInException

abstract class AccountWithTransfer(
    accountHolder: Client,
    accountNumber: Int
) : Account(
    accountHolder = accountHolder,
    accountNumber = accountNumber
) {

    fun transferMoney(targetAccount: Account, amount: Double, pass: Int){ //this function uses EXCEPTION to secure that transfers...
        if (balance < amount) { // ...just executes if the amount is higher than balance...
            throw InsufficientFoundsException(
                message = "insufficient founds. $$amount transfer, can't be done due balance: $$balance"
            ) // ...or it is going to throw this EXCEPTION
        }
        if(!checkLogIn(pass)){ // "1" means NOT
            throw NotLoggedInException()
        }
        balance -= amount
        targetAccount.depositMoney(amount)
    }
}


