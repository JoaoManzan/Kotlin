/*

    Android Studio

        Android

            É um sistema Kernel, que gerencia a comunicação entre hardware e
        software, baseado em Linux, voltado para dispositivos móveis diversos que
        permite o desenvolvimento de aplicações em Kotlin, entre outras linguagens.
            É também um sistema em camadas desde o kernel até os aplicativos, elas
        sendo:

        Kernel

            Usa uma linguagem muito próxima da máquina, e é responsável pelo
        acesso, uso e gerenciamento dos drivers.

        Hardware Abstraction Layer (HAL)

            É a Camada responsável por permitir que aplicativos consigam acessar
        funcionalidades de hardwares via API's generalistas.

        Bibliotecas C/C++

            O Android possui 1 biblioteca em C/C++ criada pelo Google chamada
        Bionic, que possui mais 3 bibliotecas: a libc, que contem os padrões C,
        libdl(Dynamic loading library), que permite o acesso, tardio ou não, a
        outras bibliotecas, e a libm que possui a parte matemática e uma
        biblioteca secundaria, a libpthread que é um modo de execução.

        Android Runtime

            O Android Runtime é um aplicativo de máquina virtual responsável por
        executar os aplicativos de usuário encapsulados nele, criando um Runtime
        para cada aplicativo e fechando ela ao fechar o mesmo.

        Java API Framework

            Que é um software que varia conforme a versão android e contem pacotes
        e classes, além de atributos e elementos para o XMl, tudo em Java.

        Aplicativos

            Que são todos os softwares adicionados posteriormente pelo usuário.


        Versões Android

            Ao criar uma aplicação é preciso considerar a versão Android base a ser
        usada, pois, cada versão implementa todas as funcionalidades das anteriores,
        porém quanto mais novo o Android usada, menos aparelhos no mercado serão
        aptos a usarem sua aplicação.
            Além disso, cada empresa pode fazer pequenas alterações no código o que,
        junto a diferentes modelos com o mesmo sistema, pode gerar erros ou até
        incompatibilidades.


    Projeto Android

            Um novo projeto criado no Android Studio vem com algumas pastas ja
        prontas em sua criação:

            Manifest
                É a pasta com o código respectivo aos acessos do aplicativo, a
            qual a primeira tela, número de telas e as definições como ícone,
             nome, entre outros.

            Java
                É a pasta onde fica o código a ser desenvolvido, assim como os
            respectivos testes.

            Res
                Dentro da res temos algumas subpastas:

            Drawable
                É onde ficam os recursos desenhaveis na tela.

            Layout
                O layout é a pasta que contem os arquivos responsáveis por cada
            tela do aplicativo sendo ligados por nome aos arquivos da pasta java

            mipmap
                É onde ficam os ícones da aplicação, em outro formato.

           Values
                Em values encontramos dois arquivos e uma subpasta:

                Colors
                    Onde ficam listadas todas as cores do aplicativo.

                Strings
                    Onde ficam listados os textos do aplicativo.

                Themes
                    Subpasta onde ficam temas diferentes como claro ou noturno.

            Xml
                É uma pasta nova.


            Gradle Scripts
                Nessa pasta encontram-se dois arquivos build.gradle, um para o projeto
            e outro onde encontra-se a versão Android mínima e a mais atual, como
            compilador, além de uma seção contendo todos os pacotes implementados
            pela versão Android escolhida, podendo ali adicionar pacotes extras.


            Convenções de código

                Para escrever nomes, usa-se a seguinte padronização:

                camelCase:
                (Primeira palavra minúscula, as seguintes maiúsculas, sem
                espaços)
                    Variáveis
                    Métodos
                    Atributos de classe
                    Parâmetros
                    Funções

                PascalCase:
                (Todas as palavras maiúsculas, sem espaços)
                    Classes

                snake_case:
                (Todas as palavras minúsculas, com o under line ao invés de espaços)

                    Variáveis de xml(textos, Id, (...))

                SCREAMING_SNAKE_CASE:
                (Todas as letras maiúsculas, com o under line ao invés de espaços)
                    Constantes

                Kebab-case:
                (Todas as palavras minúsculas, com o traço ao invés de espaços)


                Além disso, usa-se a palavra reservada const, para declarar valores
            constantes, junto dos imports.

            Ordenação na classe:

                Variáveis de escopo da classe
                inicializações
                Construtores secundários
                Objects
                Companion objects
                Override
                Overloads (agrupados entre si)


            Ao criar uma classe em um arquivo android, respeitar a nomenclatura:

            Componente      Classe               Nome do layout
            ------------------------------------------------------------------
            Activity        UserProfileActivity  activity_user_profile
            Fragment        SignUpFragment       fragment_sign_up
            Dialog          ChangePasswordDialog  dialog_change_password

                Cada classe tem seu nome, seguido do tipo do arquivo e o inverso
            para o xml.
                Além disso, cada elemento do xml leva seu tipo como prefixo de seu
            nome em snake_case.


        Lambda

            Lambda é uma simplificação das funções, ou uma função anônima, que
        não precisa de nome, pode ou não ter parâmetros e possui um bloco de
        execução, cujo tipo de retorno é sempre o da última linha. Ele pode ser
        instanciado em uma val para poder ser chamado.

           val *nomeVal* = {*parâmetros* -> *execução*}

            O lambda também permite que ele seja puxado como o parâmetro de outra
        função e pode ser criada na chamada de outra função.

            fun *nomeFun* (*nomeVal*: (*parâmetros*) -> *tipoRetorno*)

            fun main {
                *nomeFun* {*parâmetros* ->
                            *execução*}
            }

            Um adendo que no kotlin, é possível usar um lambda como classe anônima,
        em uma interface de método único e simplifica a classe anônima com override por
        um lambda, usando o SAM conversion - Single Abstract Method.

        Constante

            Constante, ou CONST é uma variável atribuída ao top level do arquivo, na
        área junto aos imports, sempre com um valor imutável e inicializado. Devido a
        isso ela poderá ser acessada por qualquer classe ou função do arquivo.

            const val  *nome* = *valor*

            A constante também pode ser declarada em um object ou companion object.



*/
