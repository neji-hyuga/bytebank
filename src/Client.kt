class Client(
    val name: String,
    val id: String,
    protected val password: Int
) : LogIn {

    override fun checkLogIn(pass: Int): Boolean {
        if (this.password == pass) {
            return true
        }
        return false
    }
}