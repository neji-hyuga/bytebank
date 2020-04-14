package com.alura.bytebank.model

class SalaryAccount(
    client: String,
    accountNumber: Int

) : Account(
    clientAccount = client,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double){
        if(this.balance >= amount){
            this.balance -= amount
        }
    }
}