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
*//*
     Layout

        View
            São elementos de interface interativos.

        View group
            É um agrupador de elementos que define a posição e comportamentos
        dos elementos nela.
            Existem tipos pré-definidos de viewGroups.
            É possível também agrupar em cascata viewGroups, delimitando áreas
        com layouts diferentes.

            <LinearLayout>
                <Button />
                <Text View />

                <LinearLayout>
                    <Button />
                    <Button />
                </LinearLayout>

            </LinearLayout>


        Tamanhos

            Existem 2 unidades de medida de tamanhos, que resolvem o problema
        da variação de pixels entre dispositivos:

            sp:
                Ou, escale independent pixels, é usado para definir um tamanho
            para textos em geral.

                android: textSize = "12sp"

            dp:
                Ou, density independent pixel, é usado para definir o tamanho
            de elementos.

                android: layout_margin = "12dp"


            Exitem também 2 comandos dinâmicos para atribuição de tamanho:

            match_parent:
                Faz o elemento receber os atributos de tamanho de seu elemento
            "mãe" ou "superior".

                android: layout_width = "match_parent"

            wrap_content:
                 Faz o elemento se adequar ao tamanho de seu conteúdo.

                android: layout_height = "wrap_content"

        Boas Práticas

            Os elementos sempre devem ser escritos com "self closing tags",
         fechando eles, neles mesmos:

                <Button *conteúdo* />

            Por último os elementos diferenciam maiúscula e minúscula:

                <Button /> != <button />

        Linear Layout

            É um tipo de viewGroup que agrupa os elementos vertical ou
        horizontalmente e com a propriedade de fracionar a tela, para tal é
        necessário alocar o tamanho da altura ou largura como 0dp e adicionar
        o elemento peso (android:layout_weight):

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <TextView
                android:layout_width="0dp"
                android:layout_height="128dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="A"
                android:textAlignment="center"
                android:textSize="32sp" />

            <TextView
                android:layout_width="0dp"
                android:layout_height="128dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="B"
                android:textAlignment="center"
                android:textSize="32sp" />

        </LinearLayout>

*/