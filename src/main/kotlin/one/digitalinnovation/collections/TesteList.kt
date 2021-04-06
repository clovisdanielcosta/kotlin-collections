package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.00, tipoContratacao = "CLT")
    val maria = Funcionario("Maria", 3200.15, tipoContratacao = "PJ")
    val pedro = Funcionario("Pedro", 1850.27, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach { println(it) }

    println("-------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-----SORTED BY --------")
     funcionarios
         .sortedBy { it.salario }
         .forEach { println(it) }

    println("-------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String

){
    override fun toString(): String =
        """
            Nome:       $nome
            Salário:    $salario
        """.trimIndent()

}