fun main() {
    println("Bem vindo ao Bytebank")
    val contaRainer =
        Conta() //Essa variável "conta" está apenas apontando para o objeto/classe "Conta". "Conta não está dentro de "conta"
    contaRainer.titular = "Rainer"
    contaRainer.numero = 1000
    contaRainer.setSaldo(-200.0)

    val contaVanessa = Conta()
    contaVanessa.titular = "Vanessa"
    contaVanessa.numero = 1001
    contaVanessa.setSaldo(300.0)

    println(contaVanessa.titular)
    println(contaVanessa.numero)
    println(contaVanessa.getSaldo())

    println(contaRainer.titular)
    println(contaRainer.numero)
    println(contaRainer.getSaldo())

//    println("depositando na conta do Rainer")
//    contaRainer.deposita(50.0)
//    println(contaRainer.saldo)
//
//    println("depositando na conta da Vanessa")
//    contaVanessa.deposita(70.0)
//    println(contaVanessa.saldo)
//
//    println("sacando na conta do Rainer")
//    contaRainer.saca(250.0)
//    println(contaRainer.saldo)
//
//    println("sacando na conta da Vanessa")
//    contaVanessa.saca(100.0)
//    println(contaVanessa.saldo)
//
//    println("saque em excesso na conta do Rainer")
//    contaRainer.saca(100.0)
//    println(contaRainer.saldo)
//
//    println("saque em excesso na conta da Vanessa")
//    contaVanessa.saca(500.0)
//    println(contaVanessa.saldo)
//
//    println("Transferência da conta da Vanessa para o Rainer")
//
//    if (contaVanessa.transfere(100.0, contaRainer)){
//        println("Transferência sucedida")
//    } else {
//        println("Falha na transferência")
//    }
//
//    println(contaRainer.saldo)
//    println(contaVanessa.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double){
        if (valor > 0) {
            saldo = valor
        }
    }
}

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Rainer $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }


    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }
    }
}


fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }


    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}