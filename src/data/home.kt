package data

class home (val adress : String, val number : Int ) {
    var address = ""
    var no: Int = 0
    constructor(adress: String): this(adress,0){
        address = adress
    }
    constructor(number: Int): this("",number){
        no = number
    }
}