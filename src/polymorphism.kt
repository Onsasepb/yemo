//Parent class
open class Shape{
    open fun draw(){
        println("drawing a shape")
    }
}
//Child class
class Rhombus : Shape(){
    override  fun draw(){
        println("Drawing a rhombus")
    }
}

class Parallelogram:Shape(){
    override fun draw(){
        println("Drawing a Parallelogram")
    }
}
fun main(){
    var s = Shape()

    var r = Rhombus()

    var p = Parallelogram()
}