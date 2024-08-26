package Classes

import PackUtilitario.Dados

class Monge : ClassePadrao{
    override val nomeClasse: String = "Monge"
    override val vidaClasse: Int = 10 + Dados.dadoOito()
}