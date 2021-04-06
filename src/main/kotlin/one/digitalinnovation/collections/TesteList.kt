package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.00)
    val maria = Funcionario("Maria", 3200.15)
    val pedro = Funcionario("Pedro", 1850.27)

    val listaFuncionarios = listOf(joao, maria, pedro)

    listaFuncionarios.forEach { println(it) }

    println("-------------")
    println(listaFuncionarios.find { it.nome == "Maria" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome:       $nome
            Salário:    $salario
            
        """.trimIndent()

}