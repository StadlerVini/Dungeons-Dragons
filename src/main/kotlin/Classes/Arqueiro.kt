package Classes

import PackUtilitario.Dados

class Arqueiro : ClassePadrao {
    override val nomeClasse: String = "Arqueiro"
    override val vidaClasse: Int = 10 + Dados.dadosDez()
}