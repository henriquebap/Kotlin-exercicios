package henrique

import one.digitalinnovation.collections.Pessoa

class Cliente (
    nome: String,
    cpf : String,
    val clienteTipo: ClienteTpo,
    val senha: String
): Pessoa(nome, cpf ), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
         Nome: $nome
         Cpf: $cpf
         Cliente Tipo: ${clienteTipo.Descricao}
    """.trimIndent()
}