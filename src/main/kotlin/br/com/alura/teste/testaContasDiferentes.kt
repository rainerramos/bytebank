import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupança
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Rainer",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        numero = 1000
    )
    println("titular ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço titular ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupança = ContaPoupança(
        titular = Cliente(
            nome = "Vanessa",
            cpf = "",
            senha = 2
        ),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupança.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupança.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupança.saldo}")

    contaCorrente.transfere(100.0, contaPoupança)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupança.saldo}")

    contaPoupança.transfere(100.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupança.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}