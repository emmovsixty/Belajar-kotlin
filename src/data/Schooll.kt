package data

class Schooll {
    var Code : Int = 0
    var Name = ""
    var Address = ""
    init {
        println("Object School di buat")
    }
    constructor(code : Int, name: String, address: String){
        Code = code
        Name = name
        Address = address
    }
    constructor(code: Int ): this(code,"",""){
        Code = code
    }

}