// example of constructor in Kotlin
class Account(
    var client: String,
    val accountNumber: Int
) {
    var balance = 0.0
        private set

//        examples of GETTERS and SETTERS in Kotlin
//        get(){return field}
//
//        set(amount){
//            field = amount
//        }

    fun depositMoney(amount: Double) {
        if (amount > 0) {
            this.balance += amount
        }
    }


    fun withdrawMoney(amount: Double) {
        if (this.balance >= amount) {
            balance -= amount
        }
    }

    fun transferMoney(targetAccount: Account, amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            targetAccount.depositMoney(amount)
            return true
        }
        return false
    }


}