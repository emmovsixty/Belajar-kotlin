package data

class Company(var name : String, var address: String) {
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> other.name == this.name
            else -> false
        }
    }
    override fun toString(): String {
        return super.toString()
    }
}