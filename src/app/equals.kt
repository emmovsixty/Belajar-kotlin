package app

import data.Company

fun main() {
    val com = Company("pt","comal")
    val com1 = Company("pt","comal")
    println(com==com1)
}