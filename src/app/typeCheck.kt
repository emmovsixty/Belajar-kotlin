package app

import data.Handphone
import data.Laptop


fun printObject(any: Any){
    if (any is Laptop){
        println("Laptop is ${any.merk}")
    } else if(any is Handphone){
        println("Handphone is ${any.merk}")
    } else {
        println(any)
    }
}
fun When(any: Any){
    when (any){
        is Laptop -> println("laptop is ${any.merk}")
        is Handphone -> println("Handphone is ${any.merk}")
        else-> println(any)
    }
}
fun main(){
    printObject(Laptop("samsung"))
    printObject(Handphone("xiaomi"))
    When(Handphone("Polytron"))
    When(Laptop("acer"))
}