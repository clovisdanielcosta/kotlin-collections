package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("João", 1000.00, tipoContratacao = "CLT")
    val maria = Funcionario("Maria", 3200.15, tipoContratacao = "PJ")
    val pedro = Funcionario("Pedro", 1850.27, tipoContratacao = "CLT")

    println("__________ LIST  ___________")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }
    println("__________ ADD ______________")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }
    println("__________ REMOVE ___________")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }
    println("__________ SET ______________")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }
    println("------ PRINT AFTER ADD ------")
    funcionarioSet.add(maria)
    funcionarioSet.add(pedro)
    funcionarioSet.forEach { println(it) }
    println("------ PRINT AFTER REMOVE ------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}