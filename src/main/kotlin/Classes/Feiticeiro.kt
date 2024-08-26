package Classes

import PackUtilitario.Dados

class Feiticeiro : ClassePadrao{
    override val nomeClasse: String = "Feiticeiro"
    override val vidaClasse: Int = 10 + Dados.dadoSeis()
}