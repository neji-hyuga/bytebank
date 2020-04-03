fun main() {
    println("welcome to bytebank:")

    val employeeOne = Employee(
        name = "Sara",
        id = "7000",
        salary = 1000.0
    )

    println("################################")
    println("welcome ${employeeOne.name}.")
    println("yoru id: ${employeeOne.id}")
    println("your salary: ${employeeOne.salary}")
    println("your anual bonus: ${employeeOne.bonus()}")
    println("################################")
    println("################################")
    println()

    val employeeTwo = Manager(
        name = "Steve",
        id = "8000",
        salary = 3000.0,
        password = 1234
    )

    println("welcome ${employeeTwo.name}.")
    println("yoru id: ${employeeTwo.id}")
    println("your salary: ${employeeTwo.salary}")
    println("your anual bonus: ${employeeTwo.bonus()}")
    println("################################")
    println("################################")

    if(employeeTwo.checkGrade(1234)){
        println("you're logged in")
    } else {
        println("forgot your password?")
    }
}






