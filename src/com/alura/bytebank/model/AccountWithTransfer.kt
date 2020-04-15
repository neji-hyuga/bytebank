package com.alura.bytebank.model

abstract class AccountWithTransfer(
    accountHolder: Client,
    accountNumber: Int
): Account(
    accountHolder = accountHolder,
    accountNumber = accountNumber
) {

    fun transferMoney(targetAccount: Account, amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            targetAccount.depositMoney(amount)
            return true
        }
        return false
    }


}