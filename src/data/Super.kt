package data

open class Super(var name : String, var type : String) {
   open fun helloWorld(name: String){
       println("hello $name may name is ${this.name} ")
   }

}
class SuperDuper(name: String,type: String): Super(name,type){
    var parentSuper = super.helloWorld("farhan")
}
