package data

open class Karyawan() {
    open val nama = "farhan"
    open var alamat = "muncang"
    open var age: Int = 0
    override fun toString(): String {
        return """nama ${this.nama}
            alamat ${this.alamat}
            umur ${this.age}
            """
    }
}

class Bawahan: Karyawan(){
    override val nama = "farhan"
}

class Atasan: Karyawan(){
    override val nama = "mualif"
}
class Anak: Karyawan(){
    override val nama = "saputra"
}