/*
    Coleções

        Introdução

            Coleções são tipos de agrupamentos de informações distribuídas em várias
        categorias. Elas são geralmente alocadas em variáveis para poderem ser usadas e
        são também o tipo a ser declarado na mesma, seguido ou não de um tipo "comum":

            val *lista*: List<Int> = listOf((...))


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
       todos os comandos de list. são aplicáveis ao set., porém ele não aceita comandos como
       o index ou o removeAt por isso.


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


*/



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



}