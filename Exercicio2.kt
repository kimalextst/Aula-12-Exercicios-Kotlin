/*Crie um algoritmo que leia uma idade de uma pessoa e calcule
quantos dias essa pessoa já viveu*/

    fun main(){
        print("Qual a sua idade? ")
        var idade = readln().toInt()

        println("Você viveu no mínimo ${idade * 365} dias")
    }