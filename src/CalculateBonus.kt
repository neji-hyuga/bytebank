class CalculateBonus {

    var totalBonus: Double =  0.0
        private set

    fun registerEmployee(employee: Employee){
        this.totalBonus += employee.bonus
    }
}