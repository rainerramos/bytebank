import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val rainer = Analista(
        nome = "Rainer",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${rainer.nome}")
    println("cpf ${rainer.cpf}")
    println("salario ${rainer.salario}")
    println("bonificação ${rainer.bonificacao}")

    val vanessa = Gerente(
        nome = "Vanessa",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${vanessa.nome}")
    println("cpf ${vanessa.cpf}")
    println("salario ${vanessa.salario}")
    println("bonificação ${vanessa.bonificacao}")

    if (vanessa.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.00
    )


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(rainer)
    calculadora.registra(vanessa)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")

}