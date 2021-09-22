fun main() {
    println("Bem vindo ao Bytebank")

    val vanessa = Gerente(
        nome = "Vanessa",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${vanessa.nome}")
    println("cpf ${vanessa.cpf}")
    println("salario ${vanessa.salario}")
    println("bonificação ${vanessa.bonificacao()}")

    if (vanessa.autentica(1234)){
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    //teste
}

