package data

class SecondaryConstructor(fName : String,
                           mName: String,
                           lName: Int) {

    constructor(fName: String, mName: String) : this(fName,mName,2002){
        println("ini constructor 1")
    }
    constructor(fName: String): this(fName,""){
        println("ini constructor 2")
    }
    var firstName = fName
    var  midleName = mName
    var lastName = lName
}