package data

open class ClassAny(var merk: String)
class Laptop(merk: String): ClassAny(merk)
class Handphone(merk: String): ClassAny(merk)