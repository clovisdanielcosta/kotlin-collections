package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "Mauro"
    nomes[1] = "Sérgio"
    nomes[2] = "Nilton"

    for (nome in nomes){
        println(nome)
    }
}