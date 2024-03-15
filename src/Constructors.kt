class Dog(var name:String,var breed:String,var age:Int,var weight:Int) {

    fun move(movement : String){
        println("The dog is $movement")
    }

}

fun main() {
    var dog1 = Dog("Bill","Chiwawa",3,20)
    var dog2 = Dog("Max","German Shepherd",4,30)

    print(dog2.name)
    print(dog2.breed)
    print(dog2.age)
    print(dog2.weight)
    dog1.move("Running")
}