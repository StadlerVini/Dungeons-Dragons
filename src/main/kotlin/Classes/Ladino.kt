package Classes

import PackUtilitario.Dados

class Ladino : ClassePadrao {
    override val nomeClasse: String = "Ladino"
    override val vidaClasse: Int = 10 + Dados.dadosDez()
}