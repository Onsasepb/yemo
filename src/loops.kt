import kotlin.math.cbrt

fun main() {
    //while
      //increment
    var number = 6
    while (number <= 10){
        println("Number is $number")
        number++
    }
       //decrement
    var num = 25
    while (num >= 20){
        println("Number is $num")
        num--
    }
    //Do....while loop
      //increment
    var no = 100
    do {
        println("Number is $no")
        no++
    }while (no <=106)
      //decrement
    var ner =106
   do {
       println("Number is $ner")
       ner--
   }while (ner >=100)

   //for loop
   var furniture = arrayOf("Table","Chair","")
   for (y in furniture){
       println(y)
   }
    var marks = arrayOf(100, 99, 98, 97)
    for (mark in marks){
        println("Mark is $mark")
    }
    //Range
    for (letter in 'a'..'d')
        println(letter)
    for (nber in 5 .. 10)
        println("number is $nber")


}