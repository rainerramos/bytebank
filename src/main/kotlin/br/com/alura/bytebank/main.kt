import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas


fun main() {
   val rainer = Cliente(nome = "Rainer", cpf = "", senha = 1)
   val contaPoupanca = ContaPoupanca(titular = rainer, numero = 1000)
   val contaCorrente = ContaCorrente(titular = rainer, numero = 1001)

   testaContasDiferentes()

   println("Total de contas: ${totalContas}")

}








