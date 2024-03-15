import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)
    println("Enter day of the week :")
    var day = reader.nextInt()

    var result = when(day){
        1 -> "Sunday"
        2 ->"Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
   else -> "Invalid day of the week"
    }
    println("The day is $result")

}