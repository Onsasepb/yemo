class Person{

    //Attributes/Properties

    var name ="James"
    var age = 21
    var locatin = "Nairobi"

    //Behaviour/Methods/Functions

    fun walk(){
        println("$name is walking")
    }
}

fun main() {
    var Doctor = Person()
    println(Doctor.age)
    println(Doctor.name)
    Doctor.walk()
}
