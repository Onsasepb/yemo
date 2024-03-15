import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val Students = mutableListOf<Pair<String,Double>>()
    while (true){
        println("Enter the name of the student:")
        val name =scanner.nextLine()
        println("Enter marks scored by $name")
        val marks = scanner.nextDouble()
        scanner.nextLine()
        Students.add(name to marks)
    }
    println("You have entered the following student details:")
    Students.forEach{(name,marks)->
        println("Student:${name},Marks:$marks")









}}


