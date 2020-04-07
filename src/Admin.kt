abstract class Admin(
    name: String,
    id: String,
    salary: Double,
    val password: Int
): Employee(
    name = name,
    id = id,
    salary = salary
){

    fun checkGrade(pass: Int): Boolean {
        if (this.password == pass) {
            return true
        }
        return false


    }


}