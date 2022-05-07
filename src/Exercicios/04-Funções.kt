//04
package Exercicios

/*
    Funções

            1- Escreva uma função que seja capaz de receber a quantidade de anos e
        transformar em meses, dias, horas, minutos e segundos. Saída desejada:

        2 anos equivalem a:
        24 meses
        730 dias
        17520 horas
        1051200 minutos
        63072000 segundos

            2- Escreva uma função capaz de receber uma string e retornar a quantidade
        de caracteres.

            3- Escreva uma função capaz de calcular o cubo de um número inteiro
        (cubo = n*n*n).

            4- Escreva uma função capaz de receber milhas e converter em km
        (1 milha = 1,6km).

            5- Escreva um programa que seja capaz de receber uma string e fazer a
        troca de todas as letras “a” ou “A” por “x”.

        a. Não deve existir lógica dentro da função main. Deve ser usada somente
        como ponto de entrada.

        b. Escrever uma função para a troca de letras e impressão do valor final.

        c. String final deve estar com todas as letras minúsculas.

            6- Sobre as funções criadas nos exercícios 2, 3 e 4. É possível
        transformá-las em funções de uma única linha? Se sim, transforme-as.
*/

fun exercicio01(ano: Int) {
    println("$ano anos é igual a:${ano * 12} messes")
    println("$ano anos é igual a:${ano * 365} dias")
    println("$ano anos é igual a:${ano * 365 * 24} horas")
    println("$ano anos é igual a:${ano * 365 * 24 * 60} minutos")
    println("$ano anos é igual a:${ano * 365 * 24 * 60 * 60} segundos")
}

fun exercicio02(str: String) {
    return println("${str.length}")
}

fun exercicio03(cubo: Int) {
    return println("${(cubo * cubo * cubo)}")
}

fun exercicio04(milhas: Float) {
    println("$milhas milhas é igual à: ${milhas * 1.6f}km")
}
/* minha try
fun exercicio05(strTroca: String){
    val index = strTroca.length
    var i = 0
    var strNova = ""
    do {
        if (strTroca[i].toString() == "a" || strTroca[i].toString() == "A")
            strNova[i] = "x"
        i++
    } while (i < index)
    println(strTroca.lowercase())
}
*/
fun exercicio05 (str: String) =
    println(str.replace("a", "x", true).lowercase())

class Exercicio06() {

    fun exercicio002(str: String) = println("${str.length}")

    fun exercicio003(cubo: Int) = println("${(cubo * cubo * cubo)}")

    fun exercicio004(milhas: Float) = println("$milhas milhas é igual à: ${milhas * 1.6f}km")
}

fun main() {

    exercicio01(4)
    exercicio02("João Manzan")
    exercicio03(4)
    exercicio04(10f)
    exercicio05("joaao")
    Exercicio06().exercicio002("joao")
    Exercicio06().exercicio003(5)
    Exercicio06().exercicio004(4.8f)


}