package Classes

import PackUtilitario.Dados

class Guerreiro : ClassePadrao{
    override val nomeClasse: String = "Guerreiro"
    override val vidaClasse: Int = 10 + Dados.dadosDez()
}