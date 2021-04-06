package one.digitalinnovation.collections

fun main() {

    val pair: Pair<String, Double> = Pair("João", 1000.00)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Sérgio" to 8500.25,
        "Joaquina" to 2352.15
        )
    map2.forEach { t, u -> println("Valor: $t  -- Valor: $u") }

}