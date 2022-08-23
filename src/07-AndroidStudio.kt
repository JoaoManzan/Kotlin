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
            tela do aplicativo e são ligados por nome aos arquivos da pasta java

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

            xml
                É uma pasta nova.


            Gradle Scripts
                Nessa pasta encontram-se dois arquivos build.gradle, um para o projeto
            e outro onde encontra-se a versão Android mínima e a mais atual, como
            compilador, além de uma seção contendo todos os pacotes implementados
            pela versão Android escolhida, podendo ali adicionar pacotes extras.
*/
