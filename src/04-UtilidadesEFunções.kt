//04
/*                                                                    *Esse^

    Debugging                                               ex1

            No IntelliJ existe a ferramente específica para Debugar,
        Basta clicar no besouro-verde no canto superior direito*, ou use
        o comando: SHIFT + F9 ou clique no play verde ao lado da fun main
        e selecione o besouro-verde escrito debug*nomeDoArquivo*

            Esse comando é amplamente usado para encontrar os erros do
        programa, pois separa os erros em uma janela especifica.
            Ele se baseia nos Break Points, que podem ser posicionados em
        quantas linhas forem necessárias e permite analisar as linhas selecionadas.

             Na análise é possível:

            -Verificar o valor de cada variável em cada etapa;
            -Encontrar o package de onde algo foi puxado;
            -Verificar qual erro especifico esta acontecendo, e em qual linha;
            -Testar linhas de código novas em algo ja escrito sem puxar o
            programa inteiro;

            Comandos:

            -Descer para as próximas linhas com o comando Step Into (F7) ou
            (seta azul para baixo);
            -Subir para as linhas Anteriores com o comando Step Out (SHIFT +
            F8) ou (seta azul para cima);
            -Pular a próxima linha com o comando Step Over (F8) ou (seta azul
            em 90º);
            -Encontrar a fonte do código em java com o comando Force Step
            Into (ALT + SHIFT + F7) ou (seta vermelha para baixo);
            -Pular para o próximo break point use o comando Resume Program
            (F9) ou (Retângulo vertical com play verdes);
            -Ver todos os break points use o comando View Brakpoints (CTRL
            + SHIFT + F8) ou (duas bolas vermelhas sobrepostas)
            -Encerar o debugger com o comando Stop (F2) ou (Quadrado vermelho)

                Ao identificar a linha com erro, é possível reescreve-la dentro
            do debugger para analisar com mais detalhes o erro;


    Analise Estática

            Além do debugger existe também a ferramenta de análise estática, que
        verifica possíveis erros e melhorias no código sem ter que rodar ele.
            A ferramenta é acessada na barra superior > Analyze > Inspect Code...
            Na ferramenta é possível analisar:

                O código inteiro;
                O projeto aberto no momento;
                Ou fazer uma análise customizada;

            Ao executar a análise estática, é possível alterar os códigos citados na
        análise pelo painel aberto pela ferramenta. Além de poder reescrever o
        código, é possível deletar pedaços inteiros marcados, com o botão: Safe delete;
            Também é possível alterar os parâmetros da análise pela barra superior:
        File > Settings > Editor > Inspections; ou com o comando:
        CTRL + Alt + S > Editor > Inspections;


    Parâmetros                                                          ex2

            Ao usar uma função, é necessário imputar seus parâmetros:

        fun *nomedaFunção*(*variável*: *tipo*, *variável2* = *valor2*) : *tipodeSaida* {
            *código*
            }
        fun main (){
            *nomeDaFunção*(*variável* = *valor*, *variável2* = *valor2*)
            }

            Porém é possível contornar isso de algumas maneiras:
            Atribuindo um valor "default" a variável que pode não ser usada, como o "" ou o 0:

        fun *nomedaFunção*(*variável*: *tipo*, *variável2* = "")
        fun *nomedaFunção*(*variável*: *tipo*, *variável2* = 0)

            Para utilizar esse método, é preciso imputar cada variável a ser puxada e seu
        valor, porém não é necessário estarem em ordem e os valores atribuídos podem ou
        não ser puxados.


    vararg                                                            ex3

            Em kotlin existe o comando: vararg , que funciona como um vetor "infinito",
        permitindo alocar quantas variáveis forem necessárias em uma função, por exemplo.
            A função .size é usada para calcular o tamanho de um vetor(vararg).
            Ja as funções: .isEmpty e .isNotEmpty , são usadas para checar se um vetor
        contem ou não algum dado.

            fun *nomeDaFunção*( vararg *nome*: *tipo*){
                if(*nom*.isNotEmpty()){
                *operação*
                }


    Comandos

            Alguns exemplos de comandos em kotlin são:
                .capitalize() = Transforma a primeira letra da string em maiúscula.
                .decapitalize() = Transforma a primeira letra da string em minuscula.
                .contains(other: "*valorAProcurar", ignoreCase: *trueOrFalse*) = Checa
                se a variável contem a *stringX*.
                .startsWith(prifix: "*valorDoPrefixo*", startIndex: *ondeComeçarAChecar*,
                ignoreCase: *trueOrFalse*) = Checa se a variável contém a *stringX* em
                seu começo.
                .endsWith(sufix: "*valorDoSufixo*", ignoreCase: *trueOrFalse*) = Checa
                se a variável contém a *stringX* em seu final.

            Todas as funções em kotlin, podem ser puxadas com uma ou mais de suas variáveis,
        dependendo de como foi escriptada.
            Ao usar um vetor de tipo incognito (vararg <T>), comumente chama-se a função
        arrayOf(), que engloba a estrutura da mesma.

    Junit (teste)

            O InteliJ possui um compilador de teste chamado JUnit, que possui uma biblioteca
        própria. Para ativar a função @Test, acesse:
        File > Project Structure > Library > + > From Maeven > junit:junit > search >
        junit:junit:4.13.2 (ou maior) > ok > apply



*//*
    Att 2022

        Generics

            Ao usar uma função com vararg é possível alocar ela como um tipo genérico,
        alocando uma letra ou palavra como o tipo:
            fun <*nomeTipo*>*nomeDaFunção*( vararg *nome*: *nomeTipo*){
                *operação*
            }
            Normalmente usam-se as letras T, J ou K, precisa-se ser colocado entre <>
        antes do nome da função e pode-se ter quantas generics forem necessárias.

        vararg

            Adendo importante, a vararg pode estar em uma função com outros parâmetros
        pré-estabelecidos, porém para a função funcionar ela precisa ser a última.
            Uma função com vararg de tipo genérico é chamada array.

        Any, Unit e Nothing

            Any é o tipo base das variáveis, sendo assim, aceita qualquer tipo de valor.
            Unit é o tipo "sem valor". Como tipo de função serve para não precisar de return
            Já o nothing é um tipo de função usado para lançar uma exceção em conjunto ao
        método To Do, que gera uma mensagem de erro. Essa estrutura é usada como place
        holder.

*/

fun endereco( rua: String = "", cidade: String, estado: String, cep: Int = 0){  //ex1
    println("rua: $rua, cep: $cep")
    println("cidade: $cidade, estado: $estado")
}

fun mediaNota( vararg notas: Float){                                            //ex3
    println(notas.size)
}

fun mediaNota2( vararg notas: Float){                                           //ex3
    if(notas.isNotEmpty()){
       var soma=0f
        for(nota in notas){
            soma += nota
        }
        println("Sua media é: ${soma/notas.size}")
    }
}

fun <gas>mediaNota3( vararg valores: gas){                                      //ex3
    for (valor in valores) println(valor)
}

fun tipoAny(any: Any): Unit{                                                         //ex5
    println("aceita: $any")
}

fun aImplementar(): Nothing{
    TODO ("Função ainda não implementada")
}


fun main (){

    val str="olá"                                                       //ex1
    print(str)
    try{
    str.toDouble()
    }catch(e:NumberFormatException){
        println("O valor imputado não é um numero!")
    }
    println(str)

    var a = 6

    endereco("","","",0)                            //ex2
    endereco(cidade = "campinas", estado = "SP")
    endereco(cep = 13, cidade = "campinas", estado = "")
    println()

    mediaNota()                                                           //ex3
    mediaNota(5.4f, 8.3f, 6.3f)
    mediaNota2(5.5f, 8.0f, 6.5f)
    mediaNota2(5f,8f,2f,6f)
    mediaNota3("",6,6.6f, 6.6, false)
    println()

    println(str.capitalize())                                              //ex4
    println(str.decapitalize())
    println(str.contains("lá",true, ))
    println(str.startsWith("o", 0, true ))
    println(str.endsWith("á"))

    tipoAny("String")
    tipoAny('C')
    tipoAny(10)
    tipoAny(10.0f)
    tipoAny(true)

}