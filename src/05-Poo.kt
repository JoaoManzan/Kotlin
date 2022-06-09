//05
/*

        Programação orientada a objetos

                A POO sistematiza as estruturas de códigos em pacotes, pelo uso
            de funções e classes, permitindo um maior reaproveitamento de códigos
            e uma execução não linear.


        Classes

                As classes são arquivos que contem Funções (métodos) e variáveis
            (atributos), funcionando como um pacote de funções com variáveis de
            entrada. Ao ser chamada na main, aloca-se a um value e ela passa a ser
            um objeto instanciado, virando um comando do qual puxam-se métodos e
            atributos mais facilmente.

                class *nomeClasse* (var *nomeVar*: *tipoVar*, var *nomeVar2*"..." ) {
                    fun *nomeFunção* (){
                        *Método*
                }fun *nomeFunção2* (){
                        *Método2*
                }"..."}


        Construtores

                São uma parte do código responsável por puxar as variáveis ao se
            instanciar uma classe ou função, por exemplo. No kotlin geralmente os
            construtores sao ativados automaticamente pela IDE para facilitar.
                É basicamente o responsável por voce não ter que escrever o nome
            e o tipo das variáveis ao puxar uma função.
                Porém, é possível estabelecer mais de um construtor para a fim de
            ter mais de um modo de se puxar uma classe, para, por exemplo, puxar
            com uma variável a mais, porém nunca a menos.
                Para integrar uma variável do construtor a um método dentro da classe
            é preciso declara-la como null na classe e usar o comando:
             this.*nomeVar* = *nomeVar* , dentro do construtor

                class *nomeClasse* (var *nomeVar*: *tipoVar*) {

                    var *nomeVar* : *tipoVar*? = null

                    constructor(*nomeVar*:  *tipoVar*, *nomeVarNova* :  *tipoVarNova*
                    "...") : this(*nomeVar*){

                    this.*nomeVar* = *nomeVar*

                    }}


        Getters e Setters

                Getters e setters são usados para o incapsulamento de variáveis, para,
            por exemplo, negar o acesso ou a modificação a uma variável que não
            pode ser alterada. No java é necessário codificar o incapsulamento, porém
            no kotlin ele é feito automaticamente pela ide, ainda respeitando os
            parâmetros. Em java o nome disso é boilerplate.



        Field

                Field é uma extensão de getters e setters, pois apesar de eles serem
            executados automaticamente pelo kotlin, o comando field é usado para
            identificar o uso de um getters ou setter modificado.

            var *nomeVar*: *tipoVar* = *valorVar*
                get() {
                   *CódigoExtra*
                    return field
                }
                set(value) {
                    *CódigoExtra*
                    field = value
                }


        Classes Enum

                Classes enum é um comando ao criar uma classe, identificando-a como
            uma lista, a qual qualquer string escrita passa a ser um comando dentro
            da classe:

            enum class *nomeClasse* {
            *texto1*,*texto2*,*texto3*(...)
            }


        Data Class

                Data class é um tipo e classe usado para agrupar e transitar dados,
            é possível codar dentro dela, porém a convenção é de ser uma linha
            simples apenas para agrupamento de dados.
                Além disso, o data class converte os dados dentro dela via override
            com 3 comandos: o .toStirng, que converte o print da variável; o .hashCode
            que gera um código especifico para a classe de acordo com seus valores;
            e o .equals que permite comparar duas classes.
                O comando implícito .equals é o responsável por, ao usar a data class,
            fazer com que os dados dentro dela sejam lidos como valores e não como
            posições dentro da memória.
                Já o comando .hashcode é responsável por alocar um código de
            identificação a uma variável. Dentro de uma data class qualquer variável
            que for atribuída com um valor da data class passa a ter o mesmo hashcode
            se possuir o mesmo valor e orbitar em um hashcode próximo com valores
            diferentes.
                Além desses ela também possui um comando implícito de .copy, que permite
            copiar todos os valores de uma variável para outra.

            data class *nomeClasse* (var *nomeVar*: *tipoVar*,var *nomeVar1*: *tip[...]){
            }


        With

                É um comando simples do kotlin que permite usar vários métodos, sendo ou
            não de uma só função, em uma só variável.
                with(*nomeVar*){
                    *nomeVar*.*método*
                    *nomeVar*.*método1*
                    println(*nomeVar*.*método2*)
                   [...]
                }


        Herança / Open Class

                É um conceito dentro de poo, o qual uma função(Chamada pai) é puxada
            para poder ser executada por outra função (Chamada filha). Ela é util pela
            reutilização e consequente "limpeza" no código.
                Para isso é necessário usar o tipo de classe chamado open class, que
            permite que a classe seja puxada por outras.

            open class *nomeOC* (var *nomeVarOC*: *tipoVarOC*,"..." ) {
                fun *nomeFunção* (){
                     *Método*
                     }
    class *nomeC* (*nomeVarOC*: *tipoVarOC* var *nomeVar*: *tipoVar*):*nomeOC*(*nomeVarOC*){
                fun *nomeFunção* (){
                    *Método*
                    }


        Override e Overload

                Do mesmo jeito que com a herança uma class pode herdar os atributos de
            outra, desde que seja uma open class, pode-se usar o comando override para
            mudar a execução de uma função ja existente.
                Para executar o código dentro do override é preciso do código
            super.*nomeFunção* para ter uma saida.


               open class *nomeOC* (var *nomeVarOC*: *tipoVarOC*,"..." ) {
                fun *nomeFunção* (){
                     *Método*
                     }
    class *nomeC* (*nomeVarOC*: *tipoVarOC* var *nomeVar*: *tipoVar*):*nomeOC*(*nomeVarOC*){
                override fun *nomeFunção* (){
                    *Método*
                    super.*nomeFunção()}



                Ja overload é uma nomenclatura a qual é atribuída para classes com
            o mesmo nome, podendo ter a mesma saida, porém com atributos diferentes,
            sejam em tipos ou quantidades.


             class *nomeClasse* (var *nomeVar*: *tipoVar*) {
                    fun *nomeFunção* (*nomeVar*: *tipoVar*){
                        *Método*}
                    fun *nomeFunção* (*nomeVar*: *tipoVar2*){
                        *Método*}
                    fun *nomeFunção* (*nomeVar*: *tipoVar3*){
                        *Método*}
                    fun *nomeFunção* (*nomeVar*: *tipoVar*, *nomeVar2*: *tipoVar*){
                        *Método*}
                    fun *nomeFunção* (*nomeVar*: *tipoVar3*, *nomeVar2*: *tipoVar4*){
                        *Método*}

    Modificadores de visibilidade

            Private e Public

                Private é um comando atribuído a uma função de modo a restringir
            o uso de seus métodos ao arquivo dela. Não confundir com open class.

            private class *nomeClasse* (var *nomeVar*: *tipoVar*, var *nomeVar2*"..." ){
                    fun *nomeFunção* (){
                        *Método*}

                Já Public seria um comando atribuído a uma função de modo a ampliar
            as permissões dela, porém no kotlin ele ja é implícito no código,
            então não precisa ser escrito.




 */







open class pessoa (var nome: String) {                      //Ex classes/Ex open class

    var idade: Int? = null

    constructor(nome: String, idade: Int) : this(nome){
        this.idade = idade
    }

    open fun saudacao (){
        println("Olá, $nome de $idade anos")
    }

    var Sexo: String = ""
    get() {
        println("Getter usado")
        return field
    }
    set(value) {
        field = value
    }

}



enum class Prioridades(var id: Int){
    BAIXA(1) {
        override fun toString():String{
            return "Super Baixa"}
    }
    , MEDIA(5), ALTA(10)
}



class quadrado(val area: Float)

data class triangulo(val area: Float)

data class testeDataClass(var B: Boolean, var S: String, var I: Int){
    fun functionInsideClass(){
        println("função usada")
    }
}

fun importDataClass(){
        testeDataClass(true, "", 10).functionInsideClass()

}



class openClass(nome: String, val Din: Float) : pessoa(nome){
    fun saldo(){
    println("Ola $nome, voce possui $Din de saldo")
    }

    override fun saudacao() {
        println("xau")
        super.saudacao()
    }
    fun saldo(i:Int){
        println("override 1 $i")
    }
    fun saldo(i:Boolean){
        println("override 2 $i")
    }
    fun saldo(i:String){
        println("override 3 $i")
    }
    fun saldo(i:Int, j:String){
        println("override 4 $i $j")
    }
}



fun main(){
    val Pessoa:pessoa = pessoa("joao",26)
    println(Pessoa.saudacao())
    println(Pessoa.Sexo)
    println()



    for (p in Prioridades.values()){
        if (p.toString() == "Super Baixa"){
        println("BAIXA")
    }
        println("$p - ${p.id} - ${p.ordinal}")
    }
    println()



    val q1 = quadrado(10f)
    val q2 = quadrado(10f)
    val t1 = triangulo(10f)
    val t2 = triangulo(10f)
    println(t1)
    println(t2)
    println(q1)
    println(q2)
    println(t1 == t2)
    println(q1 == q2)
    println(t1.hashCode())
    println(t2.hashCode())
    println(q1.hashCode())
    println(q2.hashCode())
    val t3 = t2.copy()
    //val q3 = q2.copy()
    println(t3)
    println()
    println(importDataClass())
    println()



    with(t1){
        println(t1.hashCode())
        println(t1==t2)
        println(t1)
        println()

    }




    val OC: openClass = openClass("joao", 15.52f)
    with(OC) {
        println("${OC.saudacao()}")
        Sexo
        println("${OC.saldo()}")
    }
    println()

    val overloado: openClass = openClass("joao", 15.52f)
    with(overloado){
        saldo(1)
        saldo(true)
        saldo("string")
        saldo(4,"int e string")
    }





}


