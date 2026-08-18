// Tema 3: Collections
fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
}

fun ejercicio1() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println("Ejercicio 1: $totalCount")
}

fun ejercicio2() {
    val supported = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in supported
    println("Ejercicio 2: Support for $requested: $isSupported")
}

fun ejercicio3() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("Ejercicio 3: $n is spelled as '${number2word[n]}'")
}
