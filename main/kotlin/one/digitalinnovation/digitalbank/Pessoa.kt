package one.digitalinnovation.digitalbank

class Pessoa {
    var nome: String = "Ivan"
    var cpf: String = "123.456.789-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val ivan = Pessoa()

    println(ivan.pessoaInfo())
}