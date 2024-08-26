package Classes

import PackUtilitario.Dados

class Mago : ClassePadrao {
    override val nomeClasse: String = "Mago"
    override val vidaClasse: Int = 10 + Dados.dadoSeis()
}