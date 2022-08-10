package data

import app.When

open class ToString (var name : String, var age: Int){

    override fun toString(): String {
        return "nama saya ${this.name} umur saya ${this.age}"
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}