package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.00, tipoContratacao = "CLT")
    val maria = Funcionario("Maria", 3200.15, tipoContratacao = "PJ")
    val pedro = Funcionario("Pedro", 1850.27, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    println("-------------------")
    repositorio.findAll().forEach { println(it) }

    println("-------------------")
    println(repositorio.remove(maria.nome))
    println("-------------------")
    repositorio.findAll().forEach { println(it) }



}