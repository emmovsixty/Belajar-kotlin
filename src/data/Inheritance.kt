package data

open class Inheritance (var name: String, var old: Int, var gender :String){
    fun sayHello(name: String){
        println("hai $name i'm $gender named ${this.name}, i'm $old years")
    }
}

class Child1(name: String, old: Int, gender: String): Inheritance(name,old,gender)
class Child2(name: String, old: Int, gender: String): Inheritance(name,old,gender)