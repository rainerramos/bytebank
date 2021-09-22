fun testaComportamentosConta() {
    val contaRainer = Conta(titular = "Rainer", numero = 1000)
    contaRainer.deposita(200.0)

    val contaVanessa = Conta(numero = 1001, titular = "Vanessa")
    contaVanessa.deposita(300.0)

    println(contaVanessa.titular)
    println(contaVanessa.numero)
    println(contaVanessa.saldo)

    println(contaRainer.titular)
    println(contaRainer.numero)
    println(contaRainer.saldo)

    println("depositando na conta do Rainer")
    contaRainer.deposita(50.0)
    println(contaRainer.saldo)

    println("depositando na conta da Vanessa")
    contaVanessa.deposita(70.0)
    println(contaVanessa.saldo)

    println("sacando na conta do Rainer")
    contaRainer.saca(250.0)
    println(contaRainer.saldo)

    println("sacando na conta da Vanessa")
    contaVanessa.saca(100.0)
    println(contaVanessa.saldo)

    println("saque em excesso na conta do Rainer")
    contaRainer.saca(100.0)
    println(contaRainer.saldo)

    println("saque em excesso na conta da Vanessa")
    contaVanessa.saca(500.0)
    println(contaVanessa.saldo)

    println("Transferência da conta da Vanessa para o Rainer")

    if (contaVanessa.transfere(destino = contaRainer, valor = 100.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaRainer.saldo)
    println(contaVanessa.saldo)
}