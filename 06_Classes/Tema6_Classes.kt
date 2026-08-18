// Tema 6: Classes
import kotlin.random.Random

fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
}

fun ejercicio1() {
    data class Employee(val name: String, var salary: Int)

    val emp = Employee("Mary", 20)
    println("Exercise 1: $emp")
    emp.salary += 10
    println(emp)
}

fun ejercicio2() {
    data class Person(
        val name: Name,
        val address: Address,
        val ownsAPet: Boolean = true
    )
    data class Name(val first: String, val last: String)
    data class Address(val street: String, val city: City)
    data class City(val name: String, val countryCode: String)

    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )

    println("Exercise 2: $person")
}

fun ejercicio3() {
    data class Employee(val name: String, var salary: Int)

    class RandomEmployeeGenerator(
        var minSalary: Int,
        var maxSalary: Int
    ) {
        val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

        fun generateEmployee() = Employee(
            names.random(),
            Random.nextInt(from = minSalary, until = maxSalary)
        )
    }

    val empGen = RandomEmployeeGenerator(10, 30)
    println("Exercise 3:")
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())

    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
