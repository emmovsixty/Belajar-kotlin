package data

abstract class Family(name:String) {
    abstract var person : String
    abstract fun callName()
}

class Person1(name: String): Family(name){
    override var person: String = "farhan"
    override fun callName() {
        println("hai $person")
    }
}