package data

class person(var name: String, var alamat :String, var age: Int?) {
    constructor(Name: String, alamat: String): this(Name, alamat,null)
    constructor(Name: String): this(Name,"")
    // overloading ->
    fun SayHello(name : String){
        println("hai $name myname is ${this.name} i'm from ${alamat} i'm ${age} year old")
    }
    fun SayHello(name: String, question : String ){
        println("hai $name my name is ${this.name}, $question ?" )
    }
    fun fullname():String{
        return "${name} ${alamat} ${age}"
    }
}