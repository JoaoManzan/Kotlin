//02
import kotlin.math.*

/*

    Conversão de valores                                    (ex1,2,3 e 4)

            No kotlin, quando se define o tipo da variável, passa a ser
        necessário puxar a variável com o mesmo tipo de armazenamento do
        que ela.
            Porém, é possível operacionalizar dois tipos diferentes, contando
        que o tipo final da variável seja o de maior alocação.
            Além disso, caso tente alocar um valor grande demais para o
        tipo de variável escolhido, o valor retornado sera: -1

        Double 64 bits
        Float  32 bits
        Long   64 bits
        Int    32 bits
        Short  16 bits
        Byte   8  bits

            No kotlin, porém é possível converter o tipo de uma variável
        em outro usando o comando: .to*Tipo*()
            É possível também transformar uma String em outro tipo(exceto
        boolean e char), com o comando: "".to*Tipo*()

            Porém normalmente o comando só aceita strings com entradas
        numéricas.


    Cadeias de comando:                                            (ex5)

        try, catch e finally

            Quando é identificado que um erro pode acontecer durante a
        execução de uma operação, é possível usar a cadeia de comando try,
        para executar o código com possível erro, seguido da catch para
        isolar o erro, possivelmente printar uma resposta e seguir rodando o código.
            Esses dois comandos podem ser seguidos do comando finally, que
        executa um comando final sempre.

        try{
        *operação*
        } catch(e:*Erro*) {
            *retornoDesejado*
        } finally {
            *retornoSempreExecutado*
        }

            Ao usar o comando catch, é possível concatenar mais de uma
        estrutura, porém ele sempre é executado do primeiro para o último,
        então em caso de dois catch um mais genérico e um menos, é necessário
        colocar o menos genérico acima, para ter prioridade no teste.


    Null Safe                                                           (ex6)

            Ao declarar uma variável tipo null, é necessário especificar
        isso junto ao tipo da variável com um ?

            var *nome*: *Tipo*? = null

            Uma variável tipo null é util por não alocar memoria até ser usada,
        pois, apenas no momento de alocação de valor de qualquer variável, ela
        passa a ter um espaço de memória alocado.
            Sempre que for operar com uma função em uma variável nula, é
        necessário o operador Elvis: ? após o nome dela.

            println(*var*?.*operação*)

            É possível evitar o uso da ? usando uma cadeia de if:

            if(*var* != null){
                println(*var*.*operação*)
            }

            É possível também apenas deixar o programa retornar o erro usando
        o: !! após a variável nula.

            println(*var*!!.*operação*)


    Packages                                                         (ex7)

            Um pacote ou package é como uma pasta, na qual é possível criar
        outros arquivos e subpastas para escrever códigos.
            Quando uma função é puxada de outro arquivo, ela precisa importar
        o caminho. O IntelliJ automaticamente escreve no topo da tela a chamada.

            import *nomeDoArquivo*.*nomeDaFunção*

            Porém, quando é necessário usar mais de uma função do mesmo aquivo,
        é possível trocar o nome das funções por * e todas as funções do arquivo
        serão puxadas.

            import *nomeDoArquivo*.*
*//*
    Att 2022

    Tipos de dados

    Unsigned                                                         (ex8)

            O tipo de dado unsigned não aceita números negativos, assim dobrando
         a capacidade de números positivos. Ele é identificado pela letra U antes do
         tipo da variável:

         var *var*: ULong
         var *var*: UInt
         var *var*: UShort
         var *var*: UByte

            Os tipos double e float não possuem uma versão unsigned.

        Funções kotlin

            String                                                         (ex9)

            O kotlin possui funções prontas para uso que executam códigos complexos
         em um comando.
            Alguns exemplos são:

            "*varString*".Length                         -Mostra o tamanho, começando do 1.
            "*varString*"[*valorIndex*]                  -Checa o valor em Index.
            "*varString*".startsWith(*texto*)            -Checa a primeira letra.
            "*varString*".endsWith(*texto*)              -Checa a ultima letra.
            "*varString*".replace(*texto1*,*texto2* )    -Troca os valores.
            "*varString*".substring(*valorIni**valorFim*)-Checa o valor entre ini e fim.
            "*varString*".lowercase()                    -Transforma toda em minuscula.
            "*varString*".uppercase()                    -Transforma toda em minuscula.
            "*varString*".trim()                         -Remove espaços do começo e fim.

            Elas funcionam mesmo se for uma string tipo null.

            Math                                                           (ex10)

            O kotlin também possui operações próprias para a matemática. Diferente
        da biblioteca de string, a de matemática precisa ser importada.
            Os comandos são:

            max(a:*valor* ,b: *valor1*)         -Encontra o maior entre a e b.
            min(a:*valor* ,b: *valor1*)         -Encontra o menor entre a e b.
            sqrt(x: *valor*)                    -Encontra o quadrado de x.
            PI                                  -Fornece PI.
            E                                   -Fornece Euler
            round(x: *valor*)                   -Arredonda.

        Null Safety

            Null Safe

             O comando readLine() aloca uma variável tipo null "String?", por isso
         ao chamar uma var tipo readLine, usa-se: ? , !! ou o if(*var*!= null)

            try, catch e finally

            Ao usar o comando catch, ele funciona como uma função, precisando
        da atribuição de uma variável do tipo do erro desejado.
            Todos os erros são do tipo Exception, fazendo dele o erro mais genérico.

            .let                                                           (ex11)

            O comando .let funciona como um if(*var *!= null) simplificado, onde a
        variável passa a ser it.

            *varNull*?.let{ it:*tipo*
            it.*método*
            }

*/

fun trans(n1: Int) {

}

fun MaisConceitos(str: String) {
    println("Fora do package")
}


fun main() {

    var teste = ""                                                  //*3
    val n2: Double = Double.MAX_VALUE                               //*1
    var b1: Byte = 127

    println(trans(n1 = 2 * b1))                                    //ex1

    println(b1.toShort())                                          //ex2
    println(b1.toInt())
    println(b1.toLong())
    println(b1.toFloat())
    println(b1.toDouble())
    println(b1.toString())

    b1//=  n2.toByte()                                             //ex3
    println(b1)

    println("16".toShort())                                        //ex4
    println("16".toInt())
    println("16".toLong())
    println("16".toFloat())
    println("16".toDouble())

    try {                                                           //ex5
        println("nope".toDouble())
    } catch (e: NumberFormatException) {                                //*2
        println("O valor imputado não é um numero!")
    } catch (e: Exception) {
        println("Algo deu errado!")
    } finally {
        println("(finally)Fim da cadeia de fluxo.")
    }

    var nome: String? = null                                       //ex6

    println(nome?.length)

    nome = "João"
    if (nome != null) {
        println(nome.length)
    }

    MaisConceitos(str = "")                                           //ex7
    thisIsaPackage.MaisConceitos(str = "")

    //Att 2022                                                        ex8

    println(ULong.MAX_VALUE)
    println(UInt.MAX_VALUE)
    println(UShort.MAX_VALUE)
    println(UByte.MAX_VALUE)

    //ex9
    println(nome.length)
    println(nome[2])
    println(nome.startsWith("J"))
    println(nome.endsWith("O"))
    println(nome.replace("ão", "ão vitor"))
    println(nome.substring(1, 3))
    println(nome.lowercase())
    println(nome.uppercase())
    println(nome.trim())

    //ex10
    println(max(4, 10))
    println(min(4, 10))
    println(sqrt(64f))
    println(PI)
    println(E)
    println(round(3.55567f))

    //ex11

    val str = readLine()
    str?.let{
        println(it)
    }


}





