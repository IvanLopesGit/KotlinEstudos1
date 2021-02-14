package one.digitalinnovation.digitalbank

class Pessoa {
    var nome: String = "Ivan"
    var cpf: String = "123.456.789-00"
}

fun main() {
    val ivan = Pessoa()

    println(ivan.nome)
    println(ivan.cpf)
}