package Classes

import PackUtilitario.Dados

class Druido : ClassePadrao{
    override val nomeClasse: String = "Druido"
    override val vidaClasse: Int = 10 + Dados.dadoOito()
}