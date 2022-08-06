import java.util.*
fun Input (name: String, age : Int){
    println("nama $name")
    println("age $age")
    if (age >= 17){
        println("selmat anda lulus")
    } else{
        println("maaf anda belum cukup umur")
    }
}

fun main(){
    val input = Scanner(System.`in`)
    println("masukan nama")
    val name = input.next()
    println("umur")
    val age = input.nextInt()
    Input(name,age)
}