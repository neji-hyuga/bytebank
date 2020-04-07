class SavingsAccount(
    client: String,
    accountNumber: Int
) : Account(
    clientAccount = client,
    accountNumber = accountNumber
) {

    override fun withdrawMoney(amount: Double) {
        if (this.balance >= amount) {
                balance -= amount
            }
        }
    }
