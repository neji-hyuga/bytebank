class Manager(
    name: String,
    id: String,
    salary: Double,
    val password: Int

) : Employee(
    name = name,
    id = id,
    salary = salary
) {

    override val bonus: Double
        get() {
            return salary
        }


    fun checkGrade(pass: Int): Boolean {
        if (this.password == pass) {
            return true
        }
        return false


    }
}