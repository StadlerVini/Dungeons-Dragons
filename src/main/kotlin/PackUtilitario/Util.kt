package PackUtilitario

import Personagem.Personagem
import kotlin.math.floor

open class Util {

    // companion object é um bloco de código dentro de uma classe que permite criar membros estáticos
    companion object {
        fun modificarHabilidade(habilidadePersonagem: Int): Float {
            val modificador = (floor(habilidadePersonagem.toFloat() - 10) / 2)
            if(modificador >= 0.0){
                return modificador + habilidadePersonagem
            } else {
                return habilidadePersonagem.toFloat()
            }
        }

        fun modificarVida(habilidadePersonagem: Int): Float {
            val modificador = (floor(habilidadePersonagem.toFloat() - 10) / 2)
            return modificador
        }

        fun definirAtributos(pontos: Pontos) : Int{
                do {
                    val digitadoAtributo = readln().toInt()
                    val atributo: Float
                    val pontosSubtraidos: Int

                    if (digitadoAtributo <= pontos.valor && digitadoAtributo >= 0 && digitadoAtributo <= 7) {
                        atributo = Util.modificarHabilidade(8 + digitadoAtributo)

                        pontosSubtraidos = pontos.diminuirPontos(pontos, digitadoAtributo)
                        if (pontosSubtraidos >= 0) {
                            pontos.valor = pontosSubtraidos
                            println("Pontos restantes: " + pontos.valor)

                            return atributo.toInt()
                        } else {
                            print("Não há pontos suficientes para subtrair. Tente novamente: ")
                            continue
                        }
                    } else {
                        print("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 7. Tente novamente: ")
                    }
                } while (true)
        }
    }
}