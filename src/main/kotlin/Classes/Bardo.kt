package Classes

import PackUtilitario.Dados

class Bardo : ClassePadrao{
    override val nomeClasse: String = "Bardo"
    override val vidaClasse: Int = 10 + Dados.dadoOito()
}