import kotlin.random.Random

fun pesquisaBinaria(lista: List<Int>, item: Int): Int? {
    var baixo = 0
    var alto = lista.size - 1
    var etapas = 1
    while (baixo <= alto) {
        val meio = (baixo + alto) / 2
        val chute = lista[meio]
        if (chute == item) {
            return etapas
        }
        if (chute > item) {
            alto = meio - 1
        } else {
            baixo = meio + 1
        }
        etapas++
    }
    return null
}

fun main() {
    val minhaLista = (1..1000).toList()
    println("Digite o número que deseja encontrar na lista (1 a 1000): ")
    val numeroDesejado = readLine()?.toIntOrNull()
    if (numeroDesejado != null && numeroDesejado in 1..1000) {
        val etapas = pesquisaBinaria(minhaLista, numeroDesejado)
        if (etapas != null) {
            println("O número $numeroDesejado foi encontrado após $etapas etapas.")
        } else {
            println("O número $numeroDesejado não foi encontrado na lista.")
        }
    } else {
        println("Número inválido. Por favor, digite um número entre 1 e 1000.")
    }
}
