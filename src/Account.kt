// example of constructor in Kotlin
abstract class Account(
    var clientAccount: String,
    val accountNumber: Int
) {
    var balance = 0.0
        protected set

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


    abstract fun withdrawMoney(amount: Double)

    fun transferMoney(targetAccount: Account, amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            targetAccount.depositMoney(amount)
            return true
        }
        return false
    }


}