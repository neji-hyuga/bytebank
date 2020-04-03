fun testCopiesAndReferences() {
    val numberA = 10
    var numberB = numberA
    numberB++

    println("numberA $numberA")
    println("numberB $numberB")

    val accountThree = Account(client = "ewandro", accountNumber =  3000)
//    accountThree.client = "ewandro"
    println("hello! ${accountThree.client}")

    var accountFour = Account(client = "tâninha", accountNumber =  4000)
//    accountFour.client = "tania"
    println("hello! ${accountFour.client}")
}