fun main() {
    println("Bem vindo ao Bytebank")

    val rainer = Funcionario(
        nome = "Rainer",
        cpf = "222222222-22",
        salario = 1000.0
    )

    println("nome ${rainer.nome}")
    println("cpf ${rainer.cpf}")
    println("salario ${rainer.salario}")
    println("bonificação ${rainer.bonificacao()}")
}

