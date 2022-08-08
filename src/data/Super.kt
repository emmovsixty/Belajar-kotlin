package data

open class Super {
    open val rectangle: Int = -1
    open fun show(){
        println(rectangle)
    }
}

class child: Super(){
    override fun show() {
        super.show()
    }
}