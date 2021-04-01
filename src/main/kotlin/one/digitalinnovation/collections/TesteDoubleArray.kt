package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1099.12
    salarios[1] = 2035.20
    salarios[2] = 1000.30

    salarios.forEach { println(it) }

    println("---------------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("---------------------------")

    val salarios2 = doubleArrayOf(11000.00, 2500.15, 5000.11)
    salarios2.sort()
    salarios2.forEach { println(it) }

}