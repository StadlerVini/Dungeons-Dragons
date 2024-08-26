package Classes

import PackUtilitario.Dados

class Guardiao : ClassePadrao {
    override val nomeClasse: String = "Guardião"
    override val vidaClasse: Int = 10 + Dados.dadoOito()
}