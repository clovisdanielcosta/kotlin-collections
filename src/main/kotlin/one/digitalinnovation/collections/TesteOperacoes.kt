package one.digitalinnovation.collections

fun main() {
    val salarios2 = doubleArrayOf(11000.00, 2500.15, 5000.11)
    salarios2.sort()
    salarios2.forEach { println(it) }

    println("---------------------------")
    println("Menor salário: " + salarios2.min())
    println("Maior salário: " + salarios2.max())
    println("Média salarial: " + salarios2.average())

    val salariosMaiorQue2000 = salarios2.filter { it > 2600 }

    println("---------------------------")
    salariosMaiorQue2000.forEach { println(it) }

    println("---------------------------")
    println(salarios2.count { it in 2000.0..5000.00 })
}