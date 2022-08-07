package data

open class Overriding (var name: String, var age: Int, var child: Int, var salary: Int){
    open fun callSalary(){
        println("Salary : ${this.salary}")
    }
}

class Manager(name :String, age: Int, child: Int,salary: Int):Overriding(name,age,child,salary){
    override fun callSalary(){
        println("salary : ${this.salary}")
    }
}

class officeBoy(name: String,age: Int,child: Int,salary: Int):Overriding(name,age,child,salary){
    override fun callSalary() {
        println("salary : ${this.salary}")
    }

}