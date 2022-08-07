package data

class Mobil(Merk :String = "Toyota", Tahun: Int) {
    init {
        println("class $Merk di buat")
    }
    constructor(Merk: String) : this(Merk,0){
        println("ini constructor 1")
    }

    var merk = Merk
    var tahun = Tahun
}