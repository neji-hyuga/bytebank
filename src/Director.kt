class Director(
    name: String,
    id: String,
    salary: Double,
    val password: Int,
    val bonusExecutive: Double

) : Employee(
    name = name,
    id = id,
    salary = salary
) {

    override val bonus: Double
        get() {
            return super.bonus + salary + bonusExecutive
        }


    fun checkGrade(pass: Int): Boolean {
        if (this.password == pass) {
            return true
        }
        return false


    }
}