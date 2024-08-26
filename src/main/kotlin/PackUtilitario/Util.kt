package PackUtilitario

import Personagem.Personagem
import kotlin.math.floor

open class Util {

    // companion object é um bloco de código dentro de uma classe que permite criar membros estáticos
    companion object {
        fun modificarHabilidade(habilidadePersonagem: Int): Float {
            val modificador = (floor(habilidadePersonagem.toFloat() - 10) / 2)
            return modificador + habilidadePersonagem
        }

        fun modificarVida(habilidadePersonagem: Int): Float {
            val modificador = (floor(habilidadePersonagem.toFloat() - 10) / 2)
            return modificador
        }

        fun definirAtributos(pontos: Pontos) : Int{
                do {
                    val digitadoAtributo = readln().toInt()
                    val atributo: Float

                    if (digitadoAtributo <= pontos.valor && digitadoAtributo >= 0 && digitadoAtributo <= 7) {
                        atributo = Util.modificarHabilidade(8 + digitadoAtributo)

                        when (digitadoAtributo) {
                            in 1..5 ->  pontos.valor = pontos.valor - digitadoAtributo
                            6 -> pontos.valor = pontos.valor - digitadoAtributo - 1
                            7 -> pontos.valor = pontos.valor - digitadoAtributo - 2
                            else -> pontos.valor = pontos.valor - digitadoAtributo
                        }

                        println("Pontos restantes: " + pontos.valor)
                        return atributo.toInt()
                    } else {
                        print("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 7. Tente novamente: ")
                    }
                } while (true)
        }
    }
}