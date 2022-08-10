package data

abstract class User(var username: String, var password : String?){

}
class Guest(username: String): User(username,null){
    override fun toString(): String {
        return username.toString()
    }
}
class Member(username: String,password: String?):User(username,password){
    override fun toString(): String {
        return """
${username.toString()}
${password.toString()}
        """
    }
}