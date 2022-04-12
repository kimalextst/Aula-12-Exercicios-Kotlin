/*Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis.
Isto é, x deve ficar com o valor de y e y deve ficar
com o valor de x. Mostre os valores depois da troca*/

    fun main(){
        print("Digite o valor de X: ")
        var x = readln()
        print("Digite o valor de Y: ")
        var y = readln()

        var novoX = y
        var novoY = x

        print("\nO novo valor de X é $novoX e o novo valor de Y é $novoY")
    }