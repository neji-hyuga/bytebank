class CheckingAccount(
    client: String,
    accountNumber: Int
) : Account(
    client = client,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double) {
        val amountWithTaxes = amount + 0.1
        super.withdrawMoney(amountWithTaxes)
    }
}