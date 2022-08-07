package data

class person(var name: String, var alamat :String, var age: Int?) {
    constructor(Name: String, alamat: String): this(Name, alamat,null){
        println("ini constructor 1")
    }
    constructor(Name: String): this(Name,""){
        println("ini constructor 2")
    }
    fun SayHello(other : String){
        println("hai $other myname is ${name} i'm from ${alamat} i'm ${age} year old")
    }
}