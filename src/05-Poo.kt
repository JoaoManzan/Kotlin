import java.util.*

//05
/*

        Programação orientada a objetos

                A POO sistematiza as estruturas de códigos em pacotes, pelo uso
            de funções e classes, permitindo um maior reaproveitamento de códigos
            e uma execução não linear.
                Ela apresenta 4 pilares: encapsulamento, abstração, herança e
            polimorfismo.


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

                Além disso, as classes possuem métodos próprios que sempre podem ser
            usados com 3 comandos: o .toString, que gera um código respectivo a variável;
            o .hashCode que gera um código especifico para a classe de acordo com seus
            valores;
                O método .equals é o responsável por comparar variáveis como posições
            na memória.
                Já o comando .hashcode é responsável por alocar um código de
            identificação a uma variável.
                Porém, nenhum deles é muito útil assim, então deixa-se para a data class
            usa-los com suas modificações próprias.


        Construtores

                São uma parte do código responsável por puxar as variáveis ao se
            instanciar uma classe ou função, por exemplo. No kotlin geralmente os
            construtores são ativados automaticamente pela IDE para facilitar.
                É basicamente o responsável por voce não ter que escrever o nome
            e o tipo das variáveis ao puxar uma função.
                Porém, é possível estabelecer mais de um construtor para ter mais
            de um modo de se puxar uma classe, para, por exemplo, puxar com uma
            variável a mais, porém nunca a menos.
                Para integrar uma variável do construtor a um método na classe é
            preciso declara-la como null ou default na classe e usar o comando:

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
            pode ser alterada. Eles são sempre executados respectivamente quando uma
            variável é puxada ou quando uma variável tenta ser alterada.
                No java é necessário codificar o incapsulamento, porém no kotlin ele é
            feito automaticamente pela IDE, ainda respeitando os parâmetros. Em java o nome
            disso é boilerplate.



        Field

                Field é uma extensão de getters e setters, pois apesar de eles serem
            executados automaticamente pelo kotlin, o comando field é usado para
            evitar uma chamada recursiva de, por exemplo, um get com um return ficarem
            chamando um ao outro. Ele serve para representar a var inicial sem iniciar
            um get ou set e gerar um looping.


            var *nomeVar*: *tipoVar* = *valorVar*
                get() {
                   *CódigoExtra*
                    return field
                }
                set(value) {
                    *CódigoExtra*
                    field = value
                }


        Enum Classes

                Enum class é um comando ao criar uma classe, identificando-a como
            uma lista, a qual qualquer valor passa a ser um comando da classe:

                enum class *nomeClasse* {
                *texto1*,*texto2*,*texto3*(...)
                }

                *nomeClasse*.*texto2*

                Essa classe tambem passa a ser um tipo de variável.

                fun *nome*(*var* : *nomeClasse*){
                }

                Com o comando .values(), é possível puxar todos os valores em uma enum class

                 *nomeClasse*.values()

                Além disso, é possível adicionar uma variável que será alocado aos valores.

                enum class *nomeClasse*(val *var* : *tipo*) {
                *texto1*(*var*:),*texto2*(*var*:),*texto3*(*var*:)(...)
                }

                Por último cada valor da enum class pode ter seu próprio bloco de comandos,
            como um override para mudar o texto a ser escrito ao rodar o programa.

                enum class *nomeClasse* {
                *texto1*{
                override fun .toString(): String{
                    return "*novoTexto*"
                }},
                *texto2*,*texto3*(...)
                }


        Data Class

                Data class é um tipo e classe usado para agrupar e transitar dados,
            é possível codar dentro dela, porém a convenção é de ser uma linha
            simples apenas para agrupamento de dados.
                Diferente de uma classe normal é necessário declarar cada varíavel dos
            parâmetros como var ou val.
                Além disso, o método .equals tem uma execução diferente permitindo
            comparar o valor da variável ao invés de comparar espaços na memória.
                Já o comando .toString permite imprimir a classe com seus parâmetros em
            string.
                Dentro de uma data class qualquer variável atribuída com um valor da
            data class passa a ter o mesmo hashcode se possuir o mesmo valor e orbitar
            em um hashcode próximo com valores diferentes.
                Ela também possui um comando implícito de .copy, que permite copiar e
            instanciar todos os valores de uma variável para outra, além, de poder altera-los
             na cópia.
                Então ela é muito útil para declarar as variáveis e ter todos esses métodos
            extras, puxando apenas uma variável do tipo *nomeDataClass*.


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
            class *nomeC* (*nomeVarOC*: *tipoVarOC* var *nomeVar*: *tipoVar*):
            *nomeOC*(*nomeVarOC*){
               fun *nomeFunção* (){
                    *Método*
                    }


        Override e Overload

                Do mesmo jeito que com a herança uma class pode herdar os atributos de
            outra, desde que seja um open class ou open fun, pode-se usar o comando
            override para mudar a execução de um método ja existente.
                Para executar o código dentro do override é preciso do código
            super.*nomeOpenFunção* para ter uma saida.


                open class *nomeOC* (var *nomeVarOC*: *tipoVarOC*,"..." ) {
                    open fun *nomeFunção* (){
                     *Método*
                     }
    class *nomeC* (*nomeVarOC*: *tipoVarOC* var *nomeVar*: *tipoVar*):*nomeOC*(*nomeVarOC*){
                override fun *nomeOpenFunção* (){
                    *Método*
                    super.*nomeOpenFunção()}


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

            Private

                Private é um comando atribuído a uma variável, função ou class de modo
             a restringir seus usos. Uma variável ou função private serão restringidos a
             class a qual pertencem. Já uma class tem seu uso restringido ao file e não
             pode mais ser herdada.

            private class *nomeClasse* (private var *nomeVar*: *tipoVar*,"..." ){
                    private fun *nomeFunção* (){
                        *Método*}


            Protected

                O Protected é parecido com o Private, porém menos restritivo. Quando usado
            em uma variável ou função, elas ainda são acessíveis a classes que herdam a
            original.

            Public

                Já Public seria um comando atribuído a uma função de modo a ampliar
            as permissões dela, porém no kotlin ele ja é implícito no código,
            então não precisa ser escrito.


 *//*
    Att 2022

        Classes

                Classes são formadas por comportamentos e atributos e geram objetos.
                Os comportamentos são os métodos, as funções;
                Os atributos são as características, as variáveis;
                Já os objetos são gerados ao instanciar uma class. Ao fazer isso gera-se
            um espaço de memória alocado para o objeto.

                    val *nomeClass*: *nomeClass* = *nomeClass*(*parâmetros*)
                           l: objeto     l: tipo      l: instancia

                Ao criar parâmetros para uma class é necessário designa-los como val ou
            var para poder puxar os parâmetros corretamente. Outra opção é alocar ja com
            um valor estabelecido, para não ser obrigatória uma entrada de valor ao chamar a
            class.
                Após instanciada é possível aplicar atributos e métodos ao objeto usando
            o ponto: *objeto*.*comportamento* ou *objeto*.*atributo* para usar com mais
            facilidade as informações de cada ponto da class.


        Construtores

                É possível criar um construtor privado para restringir o acesso a ele.

            fun *nomeFun* private constructor(...): this(...){
            }

                this é o comando responsável por identificar o objeto ao referenciar um
            construtor.
                A maior utilidade de um construtor extra é criar um parâmetro para uma
            função ou classe que pode ou não ser chamada com a mesma, porem as variáveis
            lançadas pelo construtor não podem ser acessadas fora da classe.
                Para isso é necessário criar uma var com mesmo nome e tipo que precisa de
            um valor default ou null e alocar um no outro com o comando this:

                this.*var* = *var*

                Outra questão do construtor é que nele gera-se um novo bloco de execução
            que só roda quando suas variáveis são chamadas.


        Init

                Init é um bloco de comando executado ao instanciar uma classe.
                Ao iniciar a classe, todos os init serão executados e na ordem.

                init {
                }


        Late init

                O lateinit é uma palavra reservada às variáveis para designar uma
            inicialização tardia no código. Devido a isso ele é sempre uma var.
                Esse cenário pode ser útil para casos com variáveis nulas para não
            necessitar do tratamento do nulo até a inicialização da mesma.
                Além disso, a variável passa a só ser alocada na memória ao ser
            inicializada.
                Porém, ela precisa ser inicializada para o código não quebrar. Para isso
            o kotlin tem um if próprio de validação do lateinit:

                lateinit var *nomeVar* : *tipo*
                if(!this::*nomeVar*.isInitialized){
                }


        Object e companion object

                Static é um modelo de variável do java que faz com que a variável seja
            vista como um espelhamento na classe, enquanto sem, ela é um objeto próprio.
            Em Kotlin a palavra reservada é const.
                Companion object é um bloco de comando onde se colocam variáveis e funções
            estáticas, assim como uma data class. Só pode haver um companion object por
            class e pode ou não ter nome. Porém, ele, assim como o object, não podem ser
            usados como métodos ao instanciar a classe me objeto.
                Object um bloco de comando estático onde se colocam funções mais
            abrangentes de código. Ele precisa de um nome declarado e pode-se ter quantos
            objects forem necessários na classe. Para puxar um método ou atributo é
            necessário declarar o nome do objeto: *classNome*.*objNome*.*método*


        Abstract Class

                A Classe abstrata é permite criar função sem a implementar(Sem criar um
            corpo para ela), funcionando como uma data class, porém mais voltada para a
            herança.
                Entretanto, toda a classe que a herdar precisará implementar suas funções
            abstratas com o comando override. Além disso, ela não pode ser instanciada,
            por ter funções não implementadas.
                Por último ala pode ou não ter funções implementadas normalmente nela.

                abstract class *nomeAClass* (*var* : *tipoVar*) {
                    abstract fun *nomeAFun*(){
                }}
                class *nome* (*var* : *tipoVar*) : *nomeAClass*(*var*){
                    override fun *nomeAFun*(){
                }}


        Interface

                A interface é muito similar à classe abstrata, mas uma classe pode ter
            várias interfaces implementadas("herdadas").
                Ela também pode ou não ter funções implementadas, porém não é o usual a
            ser usado. Além disso, suas variáveis não podem ser inicializadas com valor.

                interface *nomeInterface* {
                    fun *nomeIFun*(){
                }}
                class *nome* (*var* : *tipoVar*) : *nomeInterface1*,*nomeInterface2*(...){
                    override fun *nomeIFun*(){
                }}

*/

open class Pessoa(var nome: String) {                      //Ex classes/Ex open class

    var idade: Int? = null

    constructor(nome: String, idade: Int) : this(nome) {
        this.idade = idade
    }

    open fun saudacao() {
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


enum class Prioridades(var id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super Baixa"
        }
    },
    MEDIA(5), ALTA(10)
}


class quadrado(val area: Float)

data class triangulo(val area: Float)

data class testeDataClass(var B: Boolean, var S: String, var I: Int) {
    fun functionInsideClass() {
        println("função usada")
    }
}

fun importDataClass() {
    testeDataClass(true, "", 10).functionInsideClass()

}


class openClass(nome: String, val Din: Float) : Pessoa(nome) {
    fun saldo() {
        println("Ola $nome, voce possui $Din de saldo")
    }

    override fun saudacao() {
        println("xau")
        super.saudacao()
    }

    fun saldo(i: Int) {
        println("overload 1 $i")
    }

    fun saldo(i: Boolean) {
        println("overload 2 $i")
    }

    fun saldo(i: String) {
        println("overload 3 $i")
    }

    fun saldo(i: Int, j: String) {
        println("overload 4 $i $j")
    }
}

open class Mamifero(especie: String) {
    lateinit var fala: String

    init {
        fala = when (especie) {
            "cachorro" -> {
                "au"
            }
            "gato" -> {
                "miau"
            }
            else -> {
                "???"
            }
        }
    }

    private var movimento: String? = null

    constructor(especie: String, movimento: String) : this(especie) {

        this.movimento = movimento
        if (especie == "baleia") {
            this.movimento = "nadar"
        } else {
            this.movimento = "andar"
        }
        return
    }

    fun movimentacao() {
        if (movimento != null) println(movimento)
    }

    companion object {
        const val patasMax = 4
        const val patasMin = 2
    }

    object Objeto {
        fun ornitorrinco(especie: String) {
            val reproducao = "ovo"
            if (especie == "ornitorrinco") {
                println("${especie.capitalize()}, o único que bota $reproducao.")
            }
        }
    }

}

abstract class Cachorro(especie: String) : Mamifero(especie){
    abstract fun latir (boolean: Boolean)
}

class HerdaCachorro (especie: String ) : Cachorro(especie){
    override fun latir(boolean: Boolean) {
        if (boolean)println("au")
    }
}

interface Gato {
    var variavel:String
    fun miar(boolean: Boolean)
}

class HerdaGato () : Gato {
    override fun miar(boolean: Boolean) {
        if (boolean)println("miau")
    }

    override var variavel: String
        get() = ""
        set(value) {}
}

fun main() {
    val pessoa: Pessoa = Pessoa("joao", 26)
    println(pessoa.saudacao())
    println(pessoa.Sexo)
    println()



    for (p in Prioridades.values()) {
        if (p.toString() == "Super Baixa") {
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



    with(t1) {
        println(t1.hashCode())
        println(t1 == t2)
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

    val overload: openClass = openClass("joao", 15.52f)
    with(overload) {
        saldo(1)
        saldo(true)
        saldo("string")
        saldo(4, "int e string")
    }

    val cao = Mamifero("cachorro", "")
    cao.movimentacao()
    println(cao.fala)
    val baleia = Mamifero("baleia", "")
    baleia.movimentacao()
    println(baleia.fala)
    val gato = Mamifero("gato")
    gato.movimentacao()
    println(gato.fala)
    println("Mamiferos tem de ${Mamifero.patasMin} a ${Mamifero.patasMax} patas")
    val ornitorrinco = Mamifero.Objeto.ornitorrinco("ornitorrinco")
    HerdaCachorro(especie = "cachorro").latir(true)
    HerdaGato().miar(true)

}


