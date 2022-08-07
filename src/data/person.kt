package data

class person(Name: String,
             alamat :String,
             Age: Int) {
    constructor(Name: String, alamat: String): this(Name, alamat,21){
        println("ini constructor 1")
    }
    constructor(Name: String): this(Name,""){
        println("ini constructor 2")
    }
    var name = Name
    var address = alamat
    var umur = Age
}