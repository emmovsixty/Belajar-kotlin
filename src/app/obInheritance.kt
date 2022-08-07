package app

import data.Child1
import data.Child2

fun main() {
    val man = Child1("Dika", 20, "man")
    man.sayHello("diki")

    val man2 = Child2("fafa",19,"women")
    man2.sayHello("dimas")
}