package henrique.teste

import henrique.*
import one.digitalinnovation.collections.Pessoa
import java.math.BigDecimal

fun main() {
    val maria = Gerente("Maria Oliveira", "126.768.233-77", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAuntenticacao().autentica(maria)
}

