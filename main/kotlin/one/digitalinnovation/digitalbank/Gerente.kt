package one.digitalinnovation.digitalbank

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: String)
    : Funcionario(nome, cpf, salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.40

    override fun login(): Boolean = "senha1234" == senha
}