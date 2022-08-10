package data

open class ClassAny(var merk: String)
open class Laptop(merk: String): ClassAny(merk)
class Handphone(merk: String): Laptop(merk)