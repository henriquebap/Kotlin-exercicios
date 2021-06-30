package henrique.teste

import henrique.Cliente
import henrique.ClienteTpo
import henrique.TesteAuntenticacao

fun main() {
    val jose = Cliente(
        nome = "Jose da silva",
        "123.123.444-12",
        clienteTipo = ClienteTpo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAuntenticacao().autentica(jose)
}