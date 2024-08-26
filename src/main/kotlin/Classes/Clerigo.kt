package Classes

import PackUtilitario.Dados

class Clerigo : ClassePadrao{
    override val nomeClasse: String = "Clérigo"
    override val vidaClasse: Int = 10 + Dados.dadoOito()
}