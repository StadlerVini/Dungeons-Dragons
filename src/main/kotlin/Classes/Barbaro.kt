package Classes

import PackUtilitario.Dados

class Barbaro : ClassePadrao{
    override val nomeClasse: String = "Barbaro"
    override val vidaClasse: Int = 10 + Dados.dadosDoze()
}