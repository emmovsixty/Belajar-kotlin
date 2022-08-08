package data

open class Overriding (var name: String, var age: Int, var child: Int = 0, var salary: Int = 2_000_000){
    open fun call(){
        println("Nama : ${this.name}")
        println("Salary : ${this.salary}")
        println("Jumlah anak : ${this.child}")
        println("Umur : ${this.age}")
    }
}

class Manager(name :String, age: Int, child: Int,salary: Int):Overriding(name,age,child,salary){
    override fun call(){
        println("Nama : ${this.name}")
        println("Salary : ${this.salary}")
        println("Jumlah anak : ${this.child}")
        println("Umur : ${this.age}")
    }
}

class officeBoy(name: String,age: Int,child: Int,salary: Int):Overriding(name,age,child,salary){
    override fun call() {
        println("Nama : ${this.name}")
        println("Salary : ${this.salary}")
        println("Jumlah anak : ${this.child}")
        println("Umur : ${this.age}")
    }

}