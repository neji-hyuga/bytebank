class CheckingAccount(
    client: String,
    accountNumber: Int
) : AccountWithTransfer(
    clientAccount = client,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double) {
        val amountWithTaxes = amount + 0.1
        if (this.balance >= amountWithTaxes) balance -= amountWithTaxes
    }
}