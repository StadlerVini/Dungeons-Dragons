package Classes

import PackUtilitario.Dados

class Artifice : ClassePadrao{
    override val nomeClasse: String = "Artifíce"
    override val vidaClasse: Int = 10 + Dados.dadosDez()
}