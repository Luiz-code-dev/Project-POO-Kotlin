package digitalBank.test

import digitalBank.Gerente

fun main() {

    val analu = Gerente("Analu Dias", "12345678910", 3500.00, "senha123")
    imprimeRelatorioEmployee.imprime(analu)
}

