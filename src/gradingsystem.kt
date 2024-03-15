fun main() {
    println("Enter student name:")
    val nameProceed = readLine()
    println("Enter the student's score:")
    val score= readLine()?.toIntOrNull()?:return

    val grade = when{
        score in 90..100->"A"
        score in 80..89-> "A-"
        score in 75..79-> "B+"
        score in 65..69-> "B"
        score in 60..64-> "B-"
        score in 55..59-> "C+"
        score in 50..54-> "c"
        score in 45..49-> "C-"
        score in 35..39-> "D+"
        score in 30..34-> "D"
        score in 25..29-> "D-"
        score in 10..24-> "E"

        else-> "Not applicable"

    }
    println("$grade")
}