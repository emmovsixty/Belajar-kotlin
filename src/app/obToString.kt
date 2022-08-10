package app

import data.Company
import data.ToString

fun main() {
    val nama = ToString("farhan",20)
    val nama1 = ToString("farhan",20)
    println(nama)
    println(nama1)
    println(nama1.toString()==nama.toString())
    println(nama.hashCode())
    println(nama1.hashCode())
    println(nama.hashCode() == nama1.hashCode())
    val com = Company("pt","paragon")
    val com1 = Company("pt","paragon")
    println(com==com1)
}