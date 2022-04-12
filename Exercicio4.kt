/*Crie um algoritmo que, dada uma temperatura em graus célsius,
exiba uma mensagem informando o tipo do clima, de acordo com as
seguintes condições:
a. se a temperatura estiver até 18 graus, o clima é frio;
b. se a temperatura estiver entre 19 e 23 graus, o clima é
agradável;
c. se a temperatura estiver entre 24 e 35 graus, o clima é quente;
d. se a temperatura estiver acima de 35 graus, o clima é muito
quente*/

    fun main(){
        println("Qual a temperatura do dia de hoje? ")
        println("Obs: Insira o valor em graus celsius!\n")
        var temp = readln().toInt()

        when (temp) {
            in -400..18 -> println("\nNossa, o clima ta frio hoje, né?")
            in 19..23 -> println("\nBom, o clima está agradável.")
            in 24..35 -> println("\nTá meio quente, né?")
            else -> {
                println("\nNossa, ta quente pra caramba eihn?")
            }
        }

//        resolução com if

//        if (temp <= 18){
//            println("Nossa, o clima ta frio hoje, né?")
//        } else if (temp >= 19 && temp <= 23){
//            println("Bom, o clima está agradável.")
//        } else if (temp >= 24 && temp <= 35){
//            println("Tá meio quente, né?")
//        } else {
//            println("Nossa, ta quente pra caramba eihn?")
//        }
    }