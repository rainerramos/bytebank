fun main() {
    println("Bem vindo ao Bytebank")
    val contaRainer = Conta() //Essa variável "conta" está apenas apontando para o objeto/classe "Conta". "Conta não está dentro de "conta"
    contaRainer.titular = "Rainer"
    contaRainer.numero = 1000
    contaRainer.saldo = 200.0

    val contaVanessa = Conta()
    contaVanessa.titular = "Vanessa"
    contaVanessa.numero = 1001
    contaVanessa.saldo = 300.0

//    println(contaVanessa.titular)
//    println(contaVanessa.numero)
//    println(contaVanessa.saldo)
//
//    println(contaRainer.titular)
//    println(contaRainer.numero)
//    println(contaRainer.saldo)

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

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
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

        if(i == 4) {
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