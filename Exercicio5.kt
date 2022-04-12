/*Crie um algoritmo que leia um número do usuário e informe se e o
número é positivo ou negativo*/

    fun main(){
        print("Digite um número: ")
        var numero = readln().toInt()

        if (numero <= -1){
            println("Este número é negativo!")
        } else {
            println("Este número é positivo!")
        }
    }