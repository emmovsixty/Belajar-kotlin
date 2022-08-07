package data

class Karyawan {
    var nama = ""
    var alamat = ""
    var age = 0
    var salary = 0
    var JmlAnak = 0

    init {
        println("Object Karyawan di buat")
    }
    constructor(Nama : String){
        println("constructor 1")
        nama = Nama

    }

    constructor(Nama : String, Alamat : String ){
        println("constructor 2")
        nama = Nama
        alamat = Alamat

    }
    constructor(Nama : String, Alamat : String, Age : Int){
        println("constructor 3")
        nama = Nama
        alamat = Alamat
        age = Age

    }
    constructor(Nama : String, Alamat : String,Age : Int, Salary :Int = 2_000_000){
        println("constructor 4")
        nama = Nama
        alamat = Alamat
        age = Age
        salary = Salary
    }
    constructor(Nama : String, Alamat : String,Age : Int, Salary :Int = 2_000_000, jmlAnak : Int = 0){
        println("constructor 5")
        nama = Nama
        alamat = Alamat
        age = Age
        salary = Salary
        JmlAnak = jmlAnak
    }

}