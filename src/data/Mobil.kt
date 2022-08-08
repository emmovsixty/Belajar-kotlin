package data

open class Mobil(Merk :String = "Toyota",Tahun: Int) {
    init {
        println("class $Merk di buat")
    }
    constructor(Merk: String) : this(Merk,0){
        println("ini constructor 1")
    }
    open var merk = Merk
    open var tahun = Tahun
}
class motor(Merk: String,Tahun: Int):Mobil(Merk,Tahun){
    val merkMotor = super.merk
}