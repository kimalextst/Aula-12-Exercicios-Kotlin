/*Crie um algoritmo que leia um número inteiro e mostre seu
antecessor*/

    fun main(){
        print("Digite um número: ")
        var numero = readln().toInt()

        println("O número antecessor de $numero é ${numero - 1}")
    }
