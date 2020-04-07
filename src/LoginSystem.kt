class LoginSystem {

    fun logIn(admin: Admin, password: Int){
        if(admin.checkGrade(password)){
            println("welcome to bytebank")
        } else{
            println("you're not logged in")
        }
    }
}