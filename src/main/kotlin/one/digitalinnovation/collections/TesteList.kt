package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.00)
    val maria = Funcionario("Maria", 3200.15)
    val pedro = Funcionario("Pedro", 1850.27)

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach { println(it) }

    println("-------------")
    println(funcionarios.find { it.nome == "Maria" })

     funcionarios
         .sortedBy { it.salario }
         .forEach { println(it) }
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