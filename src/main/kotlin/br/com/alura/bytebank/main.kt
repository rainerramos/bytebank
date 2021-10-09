import br.com.alura.bytebank.modelo.*


fun main() {

   val vanessa = object : Autenticavel {
      val nome: String = "Vanessa"
      val cpf: String = "111.111.111-11"
      val senha: Int = 1000

      override fun autentica(senha: Int) = this.senha == senha
   }

   val sistemaInterno = SistemaInterno()
   sistemaInterno.entra(vanessa, 1000)

   println("nome do cliente ${vanessa.nome}")

   val rainer = Cliente(nome = "Rainer", cpf = "", senha = 1)
   val contaPoupanca = ContaPoupanca(titular = rainer, numero = 1000)
   val contaCorrente = ContaCorrente(titular = rainer, numero = 1001)

   testaContasDiferentes()

   println("Total de contas: ${totalContas}")

}








