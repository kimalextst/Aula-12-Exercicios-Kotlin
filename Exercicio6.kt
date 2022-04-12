/*Crie um algoritmo que lê um valor real em dólar, e converte o valor
para reais. Considere a cotação do dolar atual*/

    fun main(){
        print("Insira a cotação atual do dolar: $")
        var cotacao = readln().toDouble()

        print("\nQual a quantidade/valor em real? R$")
        var real = readln().toDouble()

        var dolar = Math.round(real / cotacao)

        println("\nA conversão para dólar dá aproximadamente $$dolar")
    }