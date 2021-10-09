import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas


fun main() {

   val vanessa = object {
      val nome: String = "Vanessa"
      val cpf: String = "111.111.111-11"
      val senha: Int = 1000

      fun autentica(senha: Int) = this.senha == senha
   }


   println("nome do cliente ${vanessa.nome}")

   val rainer = Cliente(nome = "Rainer", cpf = "", senha = 1)
   val contaPoupanca = ContaPoupanca(titular = rainer, numero = 1000)
   val contaCorrente = ContaCorrente(titular = rainer, numero = 1001)

   testaContasDiferentes()

   println("Total de contas: ${totalContas}")

}








