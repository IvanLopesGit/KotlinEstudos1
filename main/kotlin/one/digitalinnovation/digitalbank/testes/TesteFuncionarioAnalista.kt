package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Analista
import one.digitalinnovation.digitalbank.Funcionario

fun main() {

    val joao = Analista("João", "123.456.789.00", 2000.00)

    imprimeRelatorio(joao)
}