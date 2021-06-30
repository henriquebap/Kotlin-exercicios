package henrique.teste

import henrique.ClienteTpo

fun main(){
    ClienteTpo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.Descricao}")

    }

    ClienteTpo.values().forEach {
        println("${it.name} - ${it.Descricao}")
    }
    val pf = ClienteTpo.PF
        println("${pf.name} - ${pf.Descricao}")

    val pj = ClienteTpo.PJ
    println("${pj.name} - ${pj.Descricao}")
}