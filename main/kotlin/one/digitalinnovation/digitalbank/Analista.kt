package one.digitalinnovation.digitalbank

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio()  = salario * 0.10
}