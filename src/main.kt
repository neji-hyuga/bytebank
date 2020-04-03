fun main() {
    println("welcome to bytebank:")

    val employeeOne = Employee(
        name = "Moacir",
        id = "7000",
        salary = 1000.0
    )

    println("################################")
    println("welcome: ${employeeOne.name}.")
    println("yoru id: ${employeeOne.id}")
    println("your salary: ${employeeOne.salary}")
    println("your anual bonus: ${employeeOne.bonus()}")
    println("################################")
    println("################################")
}






