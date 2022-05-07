//05
package Exercicios

/*
        Controle de fluxo

            1- Escreva um programa capaz de ler dois números inteiros que representam os lados
        de uma figura geométrica. Informar se formam um quadrado (lados iguais).

            2- Escreva um programa capaz de ler três números inteiros que representam os lados
        de um triângulo. Informar se é um triângulo equilátero (todos os lados iguais).

            3- Considere o código abaixo. Qual a saída do programa caso informado o valor 4?

           fun qualASaida(num: Int) {
             if (num >= 0) {
             if (num == 0)
             println("Primeira string")
             else println("Segunda string")
             }
             println("Terceira string")
            }

            4- Escreva um programa para ser usado na portaria de um evento.

            a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores
        de idade não são permitidos.”.

            b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a
        entrada caso não seja nenhum destes. Mensagem: “Negado. Convite inválido.”.

            c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites
        comuns começam com “XT”. Caso o código não esteja nos padrões, negar a entrada.
        Mensagem: “Negado. Convite inválido.”.

            d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”
*/

fun seraQuadrado(i: Int, j: Int) =
    if (i == j) println("é um quadrado")
    else println("não é um quadrado")

fun seraTriangulo(i: Int, j: Int, h: Int) =
    if (i == j && j == h) println("é um triângulo equilátero")
    else println("não é um triângulo equilátero")

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}
//ex3 "Segunda string" / "Terceira string"

fun portariaEvento(idade: Int, convite: String, codigo: String) {
    if (idade < 18) return println("Negado. Menores de idade não são permitidos.")
    else if (convite != "comum" && convite != "premium" && convite != "luxo")
        return println("Negado. Convite inválido.01")
    else if (!codigo.startsWith("XT") && !codigo.startsWith("XL"))
        return println("Negado. Convite inválido.02")
    else println("Welcome :)")

}



fun main() {
    seraQuadrado(4, 4)
    seraQuadrado(3, 6)
    seraTriangulo(2, 2, 2)
    seraTriangulo(3, 5, 8)
    qualASaida(4)
    portariaEvento(17, "premium", "XT5647")
    portariaEvento(20, "batata", "XT5647")
    portariaEvento(20, "premium", "XXX5647")
    portariaEvento(20, "premium", "XT5647")

}