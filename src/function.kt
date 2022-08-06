fun function(a: Int, b:Int){
    val sum = a*b
    println(sum)
}
fun parameter (fName :String,lName: String){
    println("hello $fName $lName")
}
fun defaulPrameter(jenisKelamin : String="Laki-laki"){
    println("jenis kelamin = $jenisKelamin")
}
fun returningUnType(a : Int, b :Int): Int{
    val sum = a+b
    return  sum
}
fun singleExpressionFunction() = println("ini single expression fungction")


fun main(){
    val fName = "farhan"
    val lName = "mualif"
    defaulPrameter("perempuan")
    parameter(fName,lName)
    val a = 10
    val b = 20
    function(a,b)
    println("hasil perjumlahan a + b = "+returningUnType(a,b))
    singleExpressionFunction()
}