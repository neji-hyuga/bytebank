package com.alura.bytebank

import com.alura.bytebank.model.Address

fun main() {
//    val address: Address? = Address(street = "yonge st")
//    address.let {
//       println(address?.street?.length) //example of chain call
//    }

    val address: Address? = Address(street = "yonge st")
    address?.let {
        println(address.street.length) //example of safe call combined with LET scope function
        println(address.street)
    }
}
















