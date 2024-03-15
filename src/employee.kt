class Employee(var firstname:String,var salary:Double,var position:String){
    fun role(task :String){
        println("The role is $task")

    }


}
fun main(){

    var employee1 = Employee("John",4975459.00, "Manager" )
    var employee2 = Employee("Mark",320000.00, "Human Resource" )
    var employee3 = Employee("Jane",370000.00, "Accountant" +
            "" )

    println(employee1.salary)
    println("${employee3.firstname} is the ${employee3.position}")

    employee3.role("accounting")
}