import kotlin.math.max

fun main() {
    //Predefined functions/Inbuilt library functions
    println("Hello Kotlin")

    val x =Math.sqrt(169.0)
    println(x)

    val y =Math.round(56.78)
    println(y)

    val z =Math.min(11, 2322)
    println(z)

    val number = max(3034,34634)
    println(number)
    val num = Math.max(3034,34634)
    println(num)
 //Calling a function
    name()
    sum()
    details("Felix", 45)
    details("Felab", 46)
}
//User-defined functions
fun name(){
    println("Onsase")
}
fun sum(){
    val number1 = 45
    val number2 = 23
    println(number1 + number2)
}

//Parameters and arguments
fun details(name:String, age:Int){
    println("$name is $age years old")

}