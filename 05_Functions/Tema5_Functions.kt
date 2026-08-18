// Tema 5: Functions
import kotlin.math.PI

fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
}

fun ejercicio1() {
    fun circleArea(radius: Int): Double {
        return PI * radius * radius
    }
    println("Exercise 1: ${circleArea(2)}")
}

fun ejercicio2() {
    fun circleArea(radius: Int): Double = PI * radius * radius
    println("Exercise 2: ${circleArea(2)}")
}

fun ejercicio3() {
    fun intervalInSeconds(
        hours: Int = 0,
        minutes: Int = 0,
        seconds: Int = 0
    ) = ((hours * 60) + minutes) * 60 + seconds

    println("Exercise 3:")
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}

fun ejercicio4() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println("Exercise 4: $urls")
}

fun ejercicio5() {
    fun repeatN(n: Int, action: () -> Unit) {
        for (i in 1..n) {
            action()
        }
    }

    println("Exercise 5:")
    repeatN(5) {
        println("Hello")
    }
}
