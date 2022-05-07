package Exercicios

/*
    Controle de fluxo

        for

        1- Imprima os números de 1 a 50 na mesma linha em ordem crescente.
    Saída esperada: “1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”

        2- Imprima os números de 1 a 50 na mesma linha em ordem decrescente.
    Saída esperada: “50 49 48 47 .. .. .. 2 1”

        3- Usando a resolução do exercício 1, não imprima os números múltiplos de 5.

        4- Faça a soma de todos os números no intervalo de 1 a 500.

        5-  Escreva um programa capaz de receber um número inteiro N e imprimir
    uma escada de tamanho N usando o carácter #.

Se a entrada do programa for 3, teremos:    Se a entrada do programa for 5, teremos:
#                                           #
##                                          ##
###                                         ###
                                            ####
                                            #####
*/
/*

    Controle de fluxo

        while

        1- Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa
    d’água com balões de água de 7 litros. Quantos balões cabem na caixa d’água sem que
    o volume seja excedido?

        2- FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a
    regra abaixo:

        a. Quando um número for divisível por 3, imprimir Buzz.
        b. Quando um número for divisível por 5, imprimir Fizz.
        c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.

        3- Escreva um programa capaz de receber um texto e imprimí-lo invertido.
    Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM

        4- Escreva uma função que recebe uma string, verifica se existe a mesma
     quantidade de caracteres ‘x’ e ‘o’ e retorna true ou false. Caso não exista nem
     ‘x’ nem ‘o’, retornar false.
     “xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false

*/
/*
    DESAFIO

        Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um
    benefício para incentivar os funcionários a pouparem dinheiro para a aposentadoria
    que funciona da seguinte maneira:

    Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta
    o mesmo valor. Ou seja, caso o funcionário invista 100 reais, a empresa investe mais 100.
    Este fundo de investimento possui rendimento de 0,2% ao mês.

    Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os
    mesmos 5% por conta própria já que conhece investimentos que rendem mais que 0,2%
    ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês. Considere o salário
    de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com
    saldo 0 e que investirão 5% do salário.

    Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?

*/

class For() {

    fun exercicio01For() {
        for (i in 1..50) {
            print("$i ")
        }
    }

    fun exercicio02For() {
        for (i in 50 downTo 1) {
            print("$i ")
        }
    }

    fun exercicio03For() {
        for (i in 1..50) {
            if (i % 5 != 0) print("$i ")
        }
    }

    fun exercicio04For() {
        var n = 0
        for (i in 1..500) {
            n += i
        }
        println("$n ")
    }

    fun exercicio05For() {
        do {
            println("digite o número de colunas:")
            val n = readLine()
            if (n != null && n != "") {
                for (i in 0..n.toInt()) {
                    for (z in i downTo 1) {
                        print("#")
                    }
                    println()
                }
            }
        } while (n == "")
        println()
    }

}

class While() {

    fun exercicio01While() {
        var i = 0
        var counter = -1
        while (i < 2000) {
            i += 7
            counter++
        }
        println(counter)
    }

    fun exercicio02While() {
        var i = 1
        while (i != 50) {
            if (i % 3 == 0 && i % 5 == 0)
                print("FizzBuzz ")
            else if (i % 3 == 0)
                print("Buzz ")
            else if (i % 5 == 0)
                print("Fizz ")
            else
                print("$i ")
            i++
        }
        println()
    }

    fun exercicio03While() {
        do {
            println("digite a frase a ser invertida:")
            val str = readLine()
            if (str != null && str != "") {
                /*var i = 0
                var z = str.length-1
                var troca = str.toString()
                do {
                    troca.replace(troca[i], str.toString()[z], true)
                    i++
                    z--
                } while (i < str.length)*/
                //
                /*
                var i = str.length - 1
                while (i >= 0)
                    println(str[i])
                    i++
                 */
                println(str.reversed())
            }
        } while (str == "")
    }

    fun exercicio04While() {
        do {
            println("digite a frase a ser analisada:")
            val str = readLine()
            if (str != null && str != "") {
                var i = 0
                var CountO = 0
                var CountX = 0
                while (i < str.length) {
                    if (str.lowercase()[i] == 'o') {
                        CountO++
                    } else if (str.lowercase()[i] == 'x') {
                        CountX++
                    }
                    i++
                }
                if (CountO == CountX && CountX != 0) println(true)
                else println(false)
            }
        } while (str == "")
    }

}

fun desafio() {
    do {
        println("digite os dois salários:")
        val ana = readLine()
        val paula = readLine()
        if ((ana != null && ana != "") && (paula != null && paula != "")) {
            var messes = 0
            var anaRes = 0.0
            var paulaRes = 0.0
            while (paulaRes <= anaRes) {
                anaRes += ((ana.toDouble() * 0.05) * 2) + (anaRes * 0.002)
                paulaRes += (paula.toDouble() * 0.05) + (paulaRes * 0.008)
                messes++
                if (messes > 840) {
                    println("mais de 70 anos, ou seja nunca")
                    break
                }
            }
            println(messes)
        }
    } while (ana == "" && paula == "")
}

fun main() {

    println(For().exercicio01For())
    println(For().exercicio02For())
    println(For().exercicio03For())
    For().exercicio04For()
    For().exercicio05For()

    While().exercicio01While()
    While().exercicio02While()
    While().exercicio03While()
    While().exercicio04While()

    desafio()

}