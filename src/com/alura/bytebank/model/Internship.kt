package com.alura.bytebank.model

class Internship(
    name: String,
    id: String,
    salary: Double

    ) : Employee(
    name = name,
    id = id,
    salary = salary
) {

    override val bonus: Double
        get() {
            return this.salary * 0.10
        }
}