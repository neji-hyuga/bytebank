package com.alura.bytebank.model

class Address(
    var number: Int = 0,
    var street: String = "",
    var municipality: String = "",
    var province: String = "",
    var postalCode: String = "",
    var unit: String = ""
){
    //example of RAW STRING
    override fun toString(): String {
        return """
Address(number=$number,
street='$street', 
municipality='$municipality', 
province='$province', 
postalCode='$postalCode', 
unit='$unit')""".trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (number != other.number) return false
        if (street != other.street) return false
        if (municipality != other.municipality) return false
        if (province != other.province) return false
        if (postalCode != other.postalCode) return false
        if (unit != other.unit) return false

        return true
    }

    override fun hashCode(): Int {
        var result = number
        result = 31 * result + street.hashCode()
        result = 31 * result + municipality.hashCode()
        result = 31 * result + province.hashCode()
        result = 31 * result + postalCode.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }


}


