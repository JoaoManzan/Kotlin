/*
     Layout

            O arquivo de layout possui sempre um viewGroup que engloba tudo,
        views que são os objetos e possíveis viewGroups extras para organização.
        Essa estrutura liga todos os objetos à tela de código.

        View
            São elementos de interface interativos, ou objetos.

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

            match parent:
                Faz o elemento receber os atributos de tamanho de seu elemento
            "mãe" ou "superior".

                    android: layout_width = "match_parent"

            wrap content:
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

        Atributos comuns de layout

            Existem alguns atributos básicos de um layout que podem ser definidos:

            Background
                É o comando usando para alterar a cor de fundo do view ou
            viewGroup:

                    android:background="#*cor*"

            TextColor
                É o responsável por mudar cor de textos. Assim como qualquer
            editor de cor, é aconselhável usar cores da pasta color:

                    android:textColor="@color/*nomeCor*"

            Gravity
                È o comando que define a orientação do que estiver no objeto,
            como se vai estar centralizado ou alinhado à esquerda:

                    android:gravity="*alinhamento*"

            LayoutGravity
                È o comando que define a orientação do objeto no viewGroup, aonde
            o objeto estará na tela:

                    android:layout_gravity="*alinhamento*"

            Layout Margin
                É o espaço de margem que o view ou viewGroup vai apresentar por
            fora. A quantidade de dp de ambos costuma se basear em números de
            base 2 exponenciados: 2,4,8,16,...:

                    android:layout_margin="16dp"

            Padding
                É o espaço de margem que o view ou viewGroup vai apresentar por
            dentro. Por determinar o recuo de parágrafo, é boa prática usar
            paddingStart e paddingEnd ao invés de paddingLeft e paddingRight
            para casos de tradução para um idioma oriental. Ao não definir lado,
            será aplicado ao view ou viewGroup inteiro.

                android:paddingStart="32dp"

            Scroll View
                É a barra de rolagem vertical da tela. Ela precisa de uma viewGroup
            nela e pode conter múltiplos views

                <ScrollView
                    android:layout_width="wrap_content"
                    android:layout_height="128dp"
                   <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal">
                        <TextView1/>
                        <TextView2/>
                        <TextView.../>
                    </LinearLayout>
                </ScrollView>


            Horizontal Scroll View
                É a barra de rolagem horizontal da tela. Funciona exatamente igual,
            mudando o comando para :

                <HorizontalScrollView
                </HorizontalScrollView>


            View
                É possível criar um view sem um dos valores e com 1 dp no outro para
            criar linhas divisórias, com ou sem margem, bastando alocar um background.

                <View
                    android:layout_width="match_parent"
                    android:layout_height="2dp"
                    android:background="@color/black"
                    android:layout_margin="16dp"
                    android:layout_gravity="center"
                />

            TextView
                O textView tem alguns comandos próprios para customização de textos:

                textStyle
                    Altera o texto para itálico e/ou negrito.

                        android:textStyle="bold|italic"

                textAllCaps
                    Altera todos os caracteres para maiúsculo.

                        android:TextAllCaps="true"

                fontFamily
                    Altera a fonte do texto, com opções limitadas.

                        android:fontFamily="*fontName*"

                    Porém é possível adicionar fontes extras ao entrar na aba de
                Design > Common atributes > textAppearance > fontFamily > more fonts...

            Edit Text
                É uma caixa de texto para o usuário entrar com uma informação, similar
            ao readLine().

                    <EditText
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                    />

                Esse elemento também possui seus próprios comandos:

                Input type
                    Define o tipo de variável que o campo recebe e atribui como o
                usuário vai interagir com o campo:

                        android:inputType="*tipoDeEntrada*"

                    Em casos de number, o usuário terá um teclado só com números,
                ja um textMultiLine, permite o usuário escrever textos e separar as
                linhas com o Enter.

                Hint
                    Mostra um texto fantasma, que sumirá com qualquer entrada,
                usado para avisar o usuário o que deve ser escrito no campo.

                         android:hint="*nomeDoCampo*"


            Button
                É o elemento de botão, ele aceita todos os comandos do textView
            e pode ser clicado pelo usuário.

                    <Button
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                    />


            ImageView
                É o elemento usado para adicionar imagens da pasta drawable ao layout

                    <ImageView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:src="@drawable/*Imagem*"
                    />

                É possível adicionar mais drawables à pasta, basta clicar nela com o
            botão direito > New > Vector Asset > Clip Art > Selecionar o vetor
            desejado. Podendo na mesma interface alterar cor e opacidade do vetor.
                O tamanho da imagem depende da hora de criação, porém, se for
            usado um vetor, pode ser alterado mudando o tamanho do elemento.
                Por fim é possível alterar a cor da imagem pós-exportação, basta
            usar o comando tint

                    app:tint="@color/*cor*"

*/