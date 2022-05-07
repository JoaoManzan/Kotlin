// 00
/*
           1- Para criar uma class, clique com o direito em src > new >
           Kotlin class/file > de nome e selecione tipo do novo arquivo.
           --
           2- Para: Float e Double, usar: f após o valor;
           3- Para: Char: usar '' ao invés de "" ao designar;
           4- println é uma abreviação do comando System.out.println;
           5- fun, var, val e algumas outras palavras sao reservadas para o sistema;
           6- Ao delimitar uma função, quando nao tiver tipo de saida, este sera unit;
           7- Pode-se usar a mesma assinatura de uma função mais de uma vez,
           contanto que tenham tipos ou quantidade de parâmetros diferentes;
           8- C++ é uma alusão ao comando ++, sendo assim uma evolução do C;
           --
           9- O comando println("${*var*.*operação*}") só funciona com operações
           básicas, nao aceita por exemplo *var*+= ou similar;
           10- O kotlin possui um comando para automatizar a indentação:
           Ctrl + Alt + L
           11- Para puxar o tamanho de uma string, usar o comando .length ;
           12- Para testar se uma string possui uma palavra especifica, usa-se:
           *var*.contains("*palavra*")
           --
           13- No caso de uma disjunção em um if, muitos compiladores rodaram
           apenas a primeira operação em caso de confirmação;
           14- O erro NullPointerException é um dos erros mais comuns no java
           por isso o kotlin tem uma maneira propria de identificar variáveis
           nulas.
           14.5- Ele se refere a execução de uma variável com conteúdo nulo.
           --
           15- No kotlin existe um comando chamado Range, ele é usado para que
           seja executado uma sequência de números, de X a Y;
           16- Para executar um range, use:
                in *valor1* .. *valor2*
           --
           17- O range sempre tem que ser definido do menor para o maior.
           18- Para o mesmo efeito do range, porém, do menor para o maior, use o
           comando: downTo

           19- println é um comando para escrever na tela e quebrar a linha, ja
            o print, apenas escreve e segue na mesma linha.

           20- Qualquer estrutura condicional que apresentar apenas uma linha de
           operação não precisa das chaves {}, para delimita-la.
           21- Cuidado ao usar cadeias de loop para não fazer um loop infinito,
           pois ele tende a ser rodado e crasha o programa.
           22- o comando while aceita apenas operações booleanas, não sendo
           possível usar range ou downTo em sua condição.
           23- O comando Break é usado para terminar a execução de um loop, seja
           while ou for.
           --

           02-MaisConceitos.kt

           24- É possível atribuir a uma variável o valor máximo possível do tipo
           dela usando o comando: .MAX_VALUE                                *1
           25- Para puxar um erro com a função catch é necessário colocar uma letra
           maiúscula no começo assim como os tipos.                         *2
           26- É possível alocar uma string vazia apenas designando o nome da
           variável e alocando "" como valor.                               *3
           27- NullPointerException é o erro mais comum do kotlin, ele se da quando
           uma variável nula tenta ser acessada.
           28- Ao se usar uma função que esteja em outro pacote, pressione CTRL+ B
           para abrir o arquivo que a contém.
            --

           04-UtilidadesEFunções.kt

           29- A palavra debug, no português depurar que virou debugar, vem de um
           evento onde Grace Hoper publicou em um artigo que uma maquina havia
           parado de funcionar devido a um bug, que no caso era de fato uma
           mariposa.
           30- Ao puxar uma função, ao invés de escrever o nome de cada função,
           apos abrir os parenteses (), basta digitar: "" para strings ou um número
           e cada variável sera puxada na ordem para ser alocado um/o valor.
           31- Ao utilizar uma variável tipo Float, caso o valor calculado exceda de 7
           casas, o último sera arredondado.
           32- Ao definir um tipo genérico de variável, o padrão usado é o:
           fun <T>*nomeDaFunção*( vararg *nome*: T)
           33- Para acessar o código de uma função pronta da IDEA, ou a(as) referência(as)
           de uma função sua, pressione CTRL + B ou CTRL + LeftClick.


           05-Poo.kt

           Programação orientada a objetos

           34- Ao criar uma var private em java, clique Alt + Enter na var para puxar a
           função de getter and setter automaticamente.
           35- O nome StackOverflow é dado a um erro no qual é excedida a memória.
           36- O erro "top level declaration" se refere a não estar vinculado a nada.
           Trata-se de um caso em que possivelmente as chaves estão erradas.
           37- Para instanciar uma class usa-se:
           val *nomeVar* = *nomeClass*(*parâmetro*, "...")

*/
/*
        Curiosidades

            1- Operador Elvis: Ele tem esse nome pela sua "semelhança" ao topete
            do Elvis de lado, ?:
            2- Apesar do operador Elvis parecer, ele não é um operador ternário,
            o kotlin não tem um, pois é possível usar if/else em uma linha só.

*/
/*
       Comandos

            Alguns exemplos de comandos em kotlin são:
                0- Ctrl + Alt + L = Indentação automática.
                1- Botão direito > Importar; Resolve muita coisa.
                2- SHIFT + F6 = Muda o nome de todas as referências a uma variável
                3- .capitalize() = Transforma a primeira letra da string em maiúscula
                4- .decapitalize() = Transforma a primeira letra da string em minuscula
                5- .contains("") = Checa se a variável contem a *stringX*
                6- .startsWith("") = Checa se a variável contem a *stringX* em seu começo
                7- .endsWith("") = Checa se a variável contem a *stringX* em seu final

                8- readLine() = Permite ao usuário inputar um valor
                readLine()!!.split(' ') = Descobrir o que faz o !!.split(' ')

                9- @Test = Testa a linha ou função junta a ele. para ativar o JUnit:
                File > Project Structure > Library > + > From Maeven > junit:junit >
                search > junit:junit:4.13.2 (ou maior) > ok > apply

                10- Função @Test é usada para testar um código com um resultado especificado
                e tem sempre que estar dentro de uma classe:
                class *nomeDaClasseTeste* (){
                     @Test fun *nomeDaFunção*() {
                        Assert.assertEquals("*retornoEsperado*", *nomeDaFunção*("*input*"))
                             }}
                Colinha:
                @Test fun ():{
                    Assert.assertEquals("", (""))
                    Assert.assertEquals("", (""))
                }
                 *//**
                11- Ao usar o comando /**    */ é possível comentar em verde,
                o que é geralmente usado para documentação.
                 *//*

                12- Para usar uma variável tipo long, é necessário colocar a letra "L",
                para identificar um long: var *nomeVar*: Long = 0L

                13- Para Refazer no intelliJ, use o comando CTRL + Shift + Z

                14- Ctrl + Q em uma função do sistema te permite acessar a documentação
                do respectivo comando, com seu uso e parâmetros.

                15- Shift + Esc Fecha o terminal aberto.

                16-

*/
/*
       Visual Code Studio

           Existem Algumas extensões úteis para o VCS, basta entrar em extensões
           e baixa-las. Aqui vai uma lista:

            Dracula official                            -Extensão visual.
            Auto-open markdown review                   -?
            GitLens                                     -Extensão para git.
            Kotlin                                      -Para suportar a linguagem.


*/
/*
       Glossário

           O ** entre palavras delimita o que deve ser imputado no local;
           Os exercícios de cada parte teórica e sua prática estão marcados
           com seus respectivos números;
           Exercícios com *numero representam algo anotado no NoteBook;

       EXTRAS

           No kotlin existe uma função visual identificada por uma lampada,
       ela indica que uma melhoria pode ser feita na linha marcada;
           Para acessar a função, pressione Alt + Enter, com o mouse sobre
       a lampada.

*/








