/*
    Coleções

        Introdução

            Coleções são tipos de agrupamentos de informações distribuídas em várias
        categorias.
            Elas podem receber valores simples, como Int ou String, ou receber valores como
        uma classe instanciada com vários parâmetros.
            Elas são geralmente alocadas em variáveis ou funções para poderem ser usadas e
       são também o tipo a ser declarado na mesma, seguido ou não de um tipo "comum":

            val *Coleção*: List<*Tipo*> = listOf((...))

            fun *Coleção*(): Set<*Tipo*> {
                return setOf(
                (...)
            )}

        List

            ListOf(...) é um tipo de coleção que cria um vetor alocando dados,
        preferencialmente, do mesmo tipo, e listando de zero a quanto for necessário.
            Ela pode ser mutável ou imutável e pode ou não ter seu tipo declarado:

            val *lista* = listOf(1, 2, 6, 6(...))
            var *lista*: List<*Tipo*> = listOf(1, 2(...))

            val *lista* = mutableListOf(1, 2, 6, 6 (...))
            var *lista*: MutableList<*Tipo*> = mutableListOf(1, 2(...))

            E pode também não ser inicializada, contanto que tenha um tipo estipulado:

            val *lista*: Set<*Tipo*> = setOf()

            O comando list consiste em uma vararg de tipo <T>, assumindo assim qualquer
        valor. Além disso, possui vários comandos que ajudam em sua manipulação:

            *valList*[*posição:Int*]                       -Mostra a posição indicada.
            *valList*.size                                 -Mostra o tamanho da lista.
            *valList*.add                                  -Adiciona à lista.
            *valList*.removeAt(*posição:Int*)              -Remove da lista na posição.
            *valList*.remove(*element*)                    -Remove o elemento da lista.
            *valList*.contains(*element*)                  -Verifica se contem o elemento.
            *valList*.clear()                              -Zera a lista.


        Set

            SetOf(...) é um tipo de coleção que se assemelha ao list, porém ao designar um
       elemento repetido, ele será mostrado apenas uma vez. Ele também é não ordenado então
       todos os comandos de listOf(...) são aplicáveis ao setOf(...), porém ele não aceita
       comandos como o index ou o removeAt por isso.



        Map

            MapOf(...) é um tipo de coleção baseado em chave e valor, então cada posição no
        map tem uma chave própria que será vinculada a um valor, ambos podem ser de qualquer
        tipo. Para adicionar uma informação nova ao cria-lo, usa-se o comando pair() com os
        valores.

            val *valMap*: Map<*TipoChave*, *TipoValor*> = mapOf(Pair(*chave*, *valor*))
            val *valMap* = MapOf(Pair(*chave*, *valor*), Pair(*chave2*, *valor2*))

            val *valMap*: mutableMap<*TipoChave*, *TipoValor*> = mapOf(Pair(*chave*, *valor*))
            val *valMap* = mutableMapOf(Pair(*chave*, *valor*), Pair(*chave2*, *valor2*))

            Em casos de uma chave ser usada novamente, o valor atribuído irá sobrescrever
        o antigo.
            Assim como o listOf, o mapOf tem alguns comandos próprios:

            *valMap*.keys                            -Mostra as keys do map.
            *valMap*.values                          -Mostra os values do map.
            *valMap*[*chave*]= *valor*               -Adiciona à lista chave e valor.
            *valMap*.remove(*chave*)                 -Remove o valor do map referente a chave.
            *valMap*.contains(*chave*)               -Verifica se contem o elemento.
            *valMap*.[*chave*]                       -Acessa o valor referente a chave
            *valMap*.clear()                         -Zera a lista.

        Comandos

            As coleções possuem um conjunto de comandos próprios, eles podem ser apenas
        executáveis ou com predicado: {it.*varColeção*} (um filtro para determinar o escopo
        do comando):

            .Any()/{it.*varColeção*}        — Verifica se existem elementos (Boolean).
            .Count()/{it.*varCol*}          — Conta os elementos (Int).
            .first()                        — Retorna o primeiro elemento.
            .last()                         — Retorna o último elemento.
            .firstOrNull()                  — Retorna o primeiro elemento ou nulo.
            .lastOrNull()                   — Retorna o último elemento ou nulo.
            .sum()                          — Soma os elementos (Int).
            .sumOf{it.*varCol*}             — Soma os elementos estabelecidos.
            .filter{it.*varCol*(...)}       — Retorna o predicado (Boolean).
            .take()                         — Puxa os X primeiros elementos.
            .takeLast()                     — Puxa os X últimos elementos.
            .forEach{it.*varCol*(...)}      — Passa cada item e retorna o predicado.

            .max()/{it}                     — Retorna o elemento mais alto (Int).
            .min()/{it}                     — Retorna o elemento mais baixo. (Int).
            .maxOrNull()/{it.*varCol*}      — Retorna o elemento mais alto ou nulo (Int).
            .minOrNull()/{it.*varCol*}      — Retorna o elemento mais baixo ou nulo (Int).
            .maxOf()/{it}/{it.*varCol*}     — Retorna o elemento mais alto (Int).
            .minOf()/{it}/{it.*varCol*}     — Retorna o elemento mais baixo (Int).
            .maxByOrNull{it.*varCol*}       — Retorna o objeto mais alto ou nulo (Any).
            .minByOrNull{it.*varCol*}       — Retorna o objeto mais baixo ou nulo (Any).

            .map{it.*varCol*}               — Cria uma lista com os predicados.
            .average()                      — Faz uma média do elementos (Int).
            .distinct()                     — Elimina elementos repetidos.
            .distinctBy{it}                 — Elimina elementos repetidos no predicado.
            .sorted()                       — Ordena uma lista (Int).
            .sortedDescending()             — Ordena uma lista do maior para o menor (Int).
            .reversed()                     — Inverte uma lista.

            Alguns dos comandos podem ser usados em cascata como o .filter{it.*varCol*}.any.()
        para retornar um boolean na pesquisa do filter.
            O comando it.*varColeção* se refere a um objeto na lista, seja uma classe,
        função ou variável dentro de uma coleção.
            O comando .map{it.} além de poder receber dados de mais de uma lista existente,
        pode também receber uma lista nova criada nela.


*/

private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjericão", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

fun main() {

    val lista1 = listOf(1, 2, 6, 6)
    var lista2: List<Int> = listOf(1, 2)
    val lista3 = mutableListOf(1, 2, 6, 6)
    var lista4: MutableList<Int> = mutableListOf(1, 2)

    lista3.add(8)
    lista3.remove(2)
    lista3.removeAt(2)
    println("Lista, posição 0: ${lista1[0]}")
    println("Tamanho da lista: ${lista3.size}")
    println(lista3)
    println(lista3.contains(8))
    lista3.clear()
    println("$lista3.clear")
    println()


    val set = setOf("Madrid", "São Paulo", "Berlim")
    val set2: Set<Int> = setOf()
    val setMutavel = mutableSetOf(1, 5, 5, 2, 5)

    setMutavel.add(5)
    println(setMutavel)
    setMutavel.remove(5)
    println(setMutavel.contains(5))
    setMutavel.clear()
    println("$setMutavel.clear")
    println()


    val map1: Map<String, String> = mapOf(Pair("França", "Paris"))
    val mapMutavel = mutableMapOf(Pair("França", "Paris"), Pair("França", "Paris"))

    mapMutavel["Alemanha"] = "Berlim"
    println(mapMutavel)
    println(mapMutavel.keys)
    println(mapMutavel.values)
    mapMutavel.remove("Alemanha")
    println(mapMutavel)
    println(mapMutavel.contains("França"))
    println(mapMutavel["França"])
    mapMutavel.clear()
    println("$mapMutavel.clear")
    println()


    val data = listaDeDados()
    val dataNull = listOf<Any>()

    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")
    println("Tenho ${data.count()} receitas.")
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome == "Lasanha" }) "sim" else "não"}.")
    println("Tenho ${data.count { it.nome == "Lasanha" }} receitas de Lasanha.")
    println()

    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")
    println("A primeira receita é: ${dataNull.firstOrNull()}.")
    println("A última receita é: ${dataNull.lastOrNull()}.")
    println()

    val sum = listOf(4,6)
    println("A soma da variável é: ${sum.sum()}")
    println("A soma de calorias é: ${data.sumOf { it.calorias }}")
    println()

    var filterNome = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (filterNome) "sim" else "não"}")
    filterNome = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (filterNome) "sim" else "não"}")
    println()

    println("Primeiros dois:")
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }
    println()
    println("Últimos dois:")
    val lastTwo = data.takeLast(2)
    for (x in lastTwo.withIndex()) {
        println("${x.index + 5} - ${x.value.nome}")
    }
    println()

    data.filter { it.calorias > 500 }.forEach { println(it.nome) }
    println()

    println("Mais calórica: ${ data.maxOf { it.calorias }}")
    println("Menos calórica: ${ data.minOf { it.calorias }}")
    var cal = data.maxByOrNull { it.calorias }
    println("Mais calórica: ${cal?.nome}")
    cal = data.minByOrNull { it.calorias }
    println("Menos calórica: ${cal?.nome}")
    println()

    println(data.map { it.calorias })
    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")
    println()

    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista : $listaInteiros")
    println("Lista distinta: ${listaInteiros.distinct()}.")
    println("Lista distinta by: ${listaInteiros.distinctBy{it}}.")
    println("Lista ordenada: ${listaInteiros.sorted()}")
    println("Lista ordenada decrescente: ${listaInteiros.sortedDescending()}")
    println("Lista revertida: ${listaInteiros.reversed()}")
    println("Máximo da lista: ${listaInteiros.max()}")
    println("Máximo da lista: ${listaInteiros.minOrNull()}")
    println()


}