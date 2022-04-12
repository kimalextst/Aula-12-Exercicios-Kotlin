/*Crie um algoritmo que receba do usuário um número qualquer e
verifique se esse é múltiplo de 5*/

    fun main(){
        print("Digite um número: ")
        var numero = readln().toInt()

        if (numero % 5 == 0) {
            println("$numero é um número divisivel por 5!")
        } else {
            println("$numero não é um número divisivel por 5!")
        }
    }