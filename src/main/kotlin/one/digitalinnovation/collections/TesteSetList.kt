package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("João", 1000.00, tipoContratacao = "CLT")
    val maria = Funcionario("Maria", 3200.15, tipoContratacao = "PJ")
    val pedro = Funcionario("Pedro", 1850.27, tipoContratacao = "CLT")

    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("---------")
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtact = funcionario3.subtract(funcionario2)

    resultSubtact.forEach { println(it) }

    println("---------")
    val resultIntersect = funcionario3.intersect(funcionario2)

    resultIntersect.forEach { println(it) }
}