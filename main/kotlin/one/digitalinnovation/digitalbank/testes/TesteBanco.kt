package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Banco

fun main() {
    val digiOneBank = Banco( nome = "DigiOne", numero = 12 )

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}