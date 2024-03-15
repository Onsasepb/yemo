fun main() {
    var greeting =  "Hello world"
    var firstname = "Aja"
    var lastname = "Manas"
  //String concatenation
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //Accessing a character in a string
    println(greeting[6])

    //Determining the index position of an element
    println(greeting.indexOf('H'))
    println(greeting.indexOf("world"))

    //Determining the size of a string
    println(greeting.length)
    //Modifying a string
    println(greeting.uppercase())

    //String Interpolation
    println("Hello there, my name is $firstname $lastname")
}