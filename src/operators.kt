fun main() {
  //Arithmetic operators
    var num1 = 45
    var num2 = 34
    println(num1 + num2)
    println(num1 - num2)
    println(num1 / num2)
    println(num1 * num2)
    println(num1 % num2)
    //Logic operators - and, or, not
    println( num1 < num2 && num1 != num2)  //and
    println( num1 < num2 || num1 != num2)  //or
    println( !(num1 < num2 || num1 != num2))  //not

    //Comparison Operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2) //Equal to
    println(num1 != num2) //Not equal to

    // Assignment operator
    var y = 28
    y += 2
    println(y)

    var x = 45
    x %=2
    println(x)
}