package com.alura.bytebank.model

class SavingsAccount(
    client: String,
    accountNumber: Int
) : AccountWithTransfer(
    clientAccount = client,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double) {
        if (this.balance >= amount) {
                balance -= amount
            }
        }
    }
