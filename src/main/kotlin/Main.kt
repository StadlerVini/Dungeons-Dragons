import Classes.*
import PackUtilitario.Pontos
import PackUtilitario.Util
import Racas.*
import Personagem.*

fun main() {
    println("--- Bem-vindo ao jogo Dungeons & Dragons ---")

    val personagem = Personagem()

    print("\nDigite o nome do seu jogador: ")
    personagem.nome = readln()

    var racaValida = false

    while (!racaValida) {
        println(
            "\nEscolha uma raça:" +
                    "\n1. Anão" +
                    "\n2. Anão da Colina" +
                    "\n3. Anão da montanha" +
                    "\n4. Draconato" +
                    "\n5. Drow" +
                    "\n6. Alto-elfo" +
                    "\n7. Elfo" +
                    "\n8. Elfo da floresta" +
                    "\n9. Meio-elfo" +
                    "\n10. Gnomo" +
                    "\n11. Gnomo da floresta" +
                    "\n12. Gnomo das rochas" +
                    "\n13. Halfling" +
                    "\n14. Halfling pés-leves" +
                    "\n15. Halfling robusto" +
                    "\n16. Humano" +
                    "\n17. Meio-orc" +
                    "\n18. Tiefling"
        )

        personagem.raca = when (readln().toInt()) {
            1 -> Anao()
            2 -> AnaoDaColina()
            3 -> AnaoDaMontanha()
            4 -> Draconato()
            5 -> Drow()
            6 -> Elfo()
            7 -> ElfoAlto()
            8 -> ElfoDaFloresta()
            9 -> Gnomo()
            10 -> GnomoDaFloresta()
            11 -> GnomoDasRochas()
            12 -> Halfling()
            13 -> HalflingPesLeves()
            14 -> HalflingRobusto()
            15 -> Humano()
            16 -> MeioElfo()
            17 -> MeioOrc()
            18 -> Tiefling()
            // Mapear todas as opções
            else -> {
                println("\nPor favor, selecione uma opção valida!")
                continue
            }
        }

        // Verifica se a raça foi atribuída corretamente
        if (personagem.raca != null) {
            racaValida = true
        }
    }

    var classeValida = false

    while (!classeValida) {
        println(
            "\nEscolha uma classe:" +
                    "\n1. Arqueiro" +
                    "\n2. Artífice" +
                    "\n3. Bárbaro" +
                    "\n4. Bardo" +
                    "\n5. Clérigo" +
                    "\n6. Druída" +
                    "\n7. Feiticeiro" +
                    "\n8. Guardião" +
                    "\n9. Guerreiro" +
                    "\n10. Ladino" +
                    "\n11. Mago" +
                    "\n12. Monge"
        )
        // Adicione todas as opções de classe

        personagem.classe = when (readln().toInt()) {
            1 -> Arqueiro()
            2 -> Artifice()
            3 -> Barbaro()
            4 -> Bardo()
            5 -> Clerigo()
            6 -> Druido()
            7 -> Feiticeiro()
            8 -> Guardiao()
            9 -> Guerreiro()
            10 -> Ladino()
            11 -> Mago()
            12 -> Monge()
            // Mapear todas as opções
            else -> {
                println("\nPor favor, selecione uma opção valida!")
                continue
            }
        }
        // Verifica se a classe foi atribuída corretamente
        if (personagem.classe != null) {
            classeValida = true
        }
    }



    println("\nSeu Personagem foi criado:")
    println("-----------------------------------------")
    println("Nome: " + personagem.nome)
    println("Raça: " + personagem.raca.nomeRaca)
    println("Classe: " + personagem.classe.nomeClasse)

    println("\nEscolha suas Habilidades: \n")

    do {
    val pontos = Pontos()

    print("Força: ")
    personagem.forca = Util.definirAtributos(pontos) + personagem.raca.buffForca.toInt()
    print("Destreza: ")
    personagem.destreza = Util.definirAtributos(pontos) + personagem.raca.buffDestreza.toInt()
    print("Constituicao: ")
    personagem.constituicao = Util.definirAtributos(pontos) + personagem.raca.buffConstituicao.toInt()
    print("Inteligencia: ")
    personagem.inteligencia = Util.definirAtributos(pontos) + personagem.raca.buffInteligencia.toInt()
    print("Sabedoria: ")
    personagem.sabedoria = Util.definirAtributos(pontos) + personagem.raca.buffSabedoria.toInt()
    print("Carisma: ")
    personagem.carisma = Util.definirAtributos(pontos) + personagem.raca.buffCarisma.toInt()
        if (pontos.valor != 0 && pontos.valor > 0){
            println("\nDistribua todos os pontos!\n")
        }
    } while (pontos.valor != 0 && pontos.valor > 0)

    //vida

    personagem.vida = personagem.classe.vidaClasse + Util.modificarVida((personagem.constituicao)).toInt()

    println("\nSeu Personagem:")
    println("-----------------------------------------")
    println("Nome: " + personagem.nome)
    println("Raça: " + personagem.raca.nomeRaca)
    println("Classe: " + personagem.classe.nomeClasse)
    println("-----------------------------------------")
    println("Vida: " + personagem.vida)
    println("Força: " + personagem.forca)
    println("Destreza: " + personagem.destreza)
    println("Constituicao: " + personagem.constituicao)
    println("Inteligencia: " + personagem.inteligencia)
    println("Sabedoria: " + personagem.sabedoria)
    println("Carisma: " + personagem.carisma)
    println("-----------------------------------------")

}