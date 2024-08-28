package PackUtilitario

open class Pontos {
    var valor: Int = 27

    fun diminuirPontos(pontos: Pontos, digitadoAtributo: Int): Int {
        var pontosSubtraidos: Int
        when (digitadoAtributo) {
            in 1..5 -> pontosSubtraidos = pontos.valor - digitadoAtributo
            6 ->  pontosSubtraidos = pontos.valor - digitadoAtributo - 1
            7 ->  pontosSubtraidos = pontos.valor - digitadoAtributo - 2
            else -> pontosSubtraidos = pontos.valor - digitadoAtributo
        }
        return pontosSubtraidos
    }
}