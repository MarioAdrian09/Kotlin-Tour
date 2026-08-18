// Tema 4: Control Flow
import kotlin.random.Random

fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4While()
    ejercicio4DoWhile()
    ejercicio5()
    ejercicio6()
}

fun ejercicio1() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    if (firstResult == secondResult) {
        println("Exercise 1: You win :)")
    } else {
        println("Exercise 1: You lose :(")
    }
}

fun ejercicio2() {
    val button = "A"
    println("Exercise 2: " + when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    })
}

fun ejercicio3() {
    println("Exercise 3:")
    var pizzaSlices = 0
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun ejercicio4While() {
    println("Exercise 4 - while:")
    var pizzaSlices = 0
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun ejercicio4DoWhile() {
    println("Exercise 4 - do-while:")
    var pizzaSlices = 0
    pizzaSlices++
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun ejercicio5() {
    println("Exercise 5 - FizzBuzz:")
    for (number in 1..100) {
        println(when {
            number % 15 == 0 -> "fizzbuzz"
            number % 3 == 0 -> "fizz"
            number % 5 == 0 -> "buzz"
            else -> "$number"
        })
    }
}

fun ejercicio6() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    println("Exercise 6:")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}
