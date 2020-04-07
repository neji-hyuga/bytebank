class Director(
    name: String,
    id: String,
    salary: Double,
    password: Int,
    val bonusExecutive: Double

) : Admin(
    name = name,
    id = id,
    salary = salary,
    password = password
) {

    override val bonus: Double
        get() {
            return this.salary + bonusExecutive
        }
}