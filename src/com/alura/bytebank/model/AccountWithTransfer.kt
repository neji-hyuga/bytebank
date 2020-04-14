package com.alura.bytebank.model

abstract class AccountWithTransfer(
    clientAccount: String,
    accountNumber: Int
): Account(
    clientAccount = clientAccount,
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