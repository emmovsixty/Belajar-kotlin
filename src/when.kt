import java.util.*



fun main(){
    val input = Scanner(System.`in`)
    while (true){
        println("your nilai")
        when(input.nextInt()){
            100 -> println("coumloud")
            90,80 -> println("perfect")
            70,60 -> println("good")
            50,40,30 -> println("so bad")
        }
        println("masukan nilai kembali ?")
        val confirm = input.next()
        if (confirm == "no"){
            break
        } else if (confirm == "yes"){
            continue
        } else {
            println("input salah")
        }
    }

}