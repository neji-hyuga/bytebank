class Manager(
    name: String,
    id: String,
    salary: Double,
    password: Int

) : Admin(
    name = name,
    id = id,
    salary = salary,
    password = password
) {

    override val bonus: Double
        get() {
            return salary
        }

}