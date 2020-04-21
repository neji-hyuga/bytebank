package com.alura.bytebank.model

import com.alura.bytebank.exception.InsufficientFoundsException

abstract class AccountWithTransfer(
    accountHolder: Client,
    accountNumber: Int
) : Account(
    accountHolder = accountHolder,
    accountNumber = accountNumber
) {

    fun transferMoney(targetAccount: Account, amount: Double){
        if (balance < amount) {
            throw InsufficientFoundsException()
        }
        balance -= amount
        targetAccount.depositMoney(amount)

    }
}


