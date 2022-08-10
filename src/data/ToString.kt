package data

open class ToString (var name : String, var age: Int){

    override fun toString(): String {
        return "nama saya ${this.name} umur saya ${this.age}"
    }
}