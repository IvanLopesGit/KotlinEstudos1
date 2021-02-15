package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF

    println("${pf.name} - ${pf.descricao}")
}