/*Escreva um algoritmo para ler as dimensões de um retângulo (base
e altura), calcular e escrever a área do retângulo*/

    fun main(){
        print("Digite o valor da base do retângulo em cm: ")
        var base = readln().toFloat()

        print("Digite o valor da altura do retângulo em cm: ")
        var altura = readln().toFloat()

        println("\nA área do triângulo é ${base * altura}cm")
    }