package PackUtilitario

class Dados {

    // companion object é um bloco de código dentro de uma classe que permite criar membros estáticos
    companion object{
        fun dadoSeis(): Int = (1..6).random()
        fun dadoOito(): Int = (1..8).random()
        fun dadosDez(): Int = (1..10).random()
        fun dadosDoze() : Int = (1..12).random()
    }

}