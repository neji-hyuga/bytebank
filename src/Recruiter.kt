class Recruiter(
    name: String,
    id: String,
    salary: Double

    ) : Employee(
    name = name,
    id = id,
    salary = salary
) {
    override val bonus: Double
        get() = salary * 0.5


}