/*
    Identificação de elementos

        View Binding

            É o conector entre a parte interativa do layout e a activity, para
        tal é necessário habilitar o view binding no arquivo gradle:
        gradle scripts > build.gradle (module) > object android {}:

            buildFeatures {
                viewBinding true
            }

            Além disso, cada activity terá sua própria linha de código
        vinculando-o a um arquivo de layout, que pode ser alterado para incluir
        as funcionalidades do view binding:

            Padrão:
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
            }

            Alterada:
            private lateinit var binding: ActivityMainBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)
            }

            Nessa alteração, cria-se uma lateinit var, sendo instanciada após
        a criação da activity pela fun onCreate pelo comando .inflate e, por
        fim, muda-se para setContentView(binding.root).
            Note que para tudo isso é preciso importar uma biblioteca própria
        para ter acesso ao ActivityMainBinding:

            import com.example.myapplication.databinding.ActivityMainBinding

        Evento de click

             Para implementar um evento de clique usa-se:

            onClickListener

            É uma interface do tipo view que pode ser implementada para
        dar acesso ao comando onClickListener ou pode ser instanciada em
        uma classe anônima na própria chamada.

            class MainActivity : AppCompatActivity(), View.OnClickListener {

                private lateinit var binding: ActivityMainBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)
                binding.buttonCalculate.setOnClickListener(this)
            }

                override fun onClick(view: View) {
                    if (view.id == R.id.*buttonId*){
                        (...)
                    }
            }

        Plugin

            Ao criar um projeto mais antigo, a biblioteca Kotlin android
        extensions era importada, por ela é possível identificar os elementos,
        porém é um código deprecated(que será descontinuado), então o ideal é
        evitar.

        findViewById<*Id*>

            Esse método é o mais comum e tradicional, porém, ele precisa ser
        inteiro mapeado na mão, criando uma variável para cada parte da tela,
        além de, em grande escala, consumir mais memória do que o view binding.

             class MainActivity : AppCompatActivity() {

                private lateinit var *nomeView*: *tipo*
                private lateinit var *nomeView1*: *tipo1*
                (...)

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                *nomeView* = findViewById<*tipoView*>(R.id.*nome_view*)
                *nomeView1* = findViewById(R.id.*nome_view1*)
                (...)

                *nomeView*.setOnClickListener {
                *nomeView1*.setText(R.string.text_view_phraseOne)
                (...)
                }

            }}

        Toast

            Em um botão é possível gerar uma notificação de clique com o
        comando toast:

    Toast.makeText(context: this, text: "*texto*", Toast.LENGTH_SHORT).show()

            O comando .show() mostra o toast.
            Além de texto, o Toast pode receber uma frase da pasta string, que
        é um int no campo onde seria o texto.

       Temas

            Na pasta values, existe uma subpasta themes, responsável por gerar a
        barra de utilitários do android. É possível alterar a cor padrão mudando a
        cor primária variante.
            Além disso existe a barra com o nome do aplicativo, que pode ser
        desativada na função onCreate usando o comando:

               supportActionBar?.hide()

        Tela principal

            É possível criar uma nova activity:

        app > java > com.exemple.*nomeProjeto* > botão direito > new > Activity >
        Empty Activity

        app > res > layout > botão direito > new > Activity > Empty Activity

            Ao cria-la, é possível alterar-la para ser a tela inicial de duas
        formas, ou marcando a box na criação da activity, que irá setar
        automaticamente, ou alterar no android manifest.

        app > manifest > AndroidManifest.xml

            Nele se encontram todas as activities, e a tela inicial possui o
        seguinte código:

            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

            Para altera-la basta mover o respectivo código para a nova tela inicial e
        inverter de ambas o:

            android:exported="true"

            Também no manifest é possível mudar o ícone do aplicativo:

            android:icon="@mipmap/*app_logo*"
            android:label="@string/*app_name*"
            android:roundIcon="@mipmap/*app_logo*"

            O padrão é ser um mipmap o ícone do aplicativo.

        StartActivity

            Para transpor o usuário de uma tela à outra, é preciso usar o comando
        startActivity e vincula-lo a uma intenção com duas activities de parâmetro,
        porém a segunda como uma java class:

            startActivity(Intent(this,*otherActivity*::class.java))
            finish()

            Assim inicia-se a nova activity, instancia-se a Intent com as duas
        activities de parâmetro, transfere o usuário para a próxima pagina e,
        caso queira, pode-se desabilitar a activity anterior com o comando finish,
        para não ser mais acessível.


        SharedPreferences

            É um recurso que permite transitar informações concatenando uma chave com
        uma informação.
            Ele consiste em criar uma variável do tipo SharedPreferences que recebe o
        valor contex.getSharedPreferences com dois parâmetros, a chave desse Shared
        Preferences somado a um modo de Contex.MODE_*modo*, que define o nível de
        acesso ao SharedPreferences.

        private val *nomeVal*: SharedPreferences =
        context.getSharedPreferences("*chaveString*", Context.MODE_PRIVATE)

            Para adicionar informações ao SharedPreferences é preciso criar uma função
        que edita ele e adiciona a informação como parâmetro atrelada a uma chave do
        tipo string e a informação. Após isso, aplica o processo.

            fun storeString(*nomeChave*: String, *info*: *tipo*) {
                this.*nomeVal*.edit().putString(*nomeChave*, *info*).apply()
            }

            Do mesmo jeito para extrair informação de uma SharedPreferences também é
        preciso criar uma função, porém que retorna um comando .get*Tipo*, com uma
        chave do tipo string e um retorno padrão que pode ser uma string vazia, com um
        operado elvis, que também retorne um valor padrão, para caso seja nula.

            fun getString(*nomeChave*: String): String {
                return this.*nomeVal*.getString(*nomeChave*, "") ?: ""
            }

            Esse método pode ser usado apenas em um arquivo, porém é ideal possuir uma
        classe própria. Nesses exemplos ele referencia this.*nomeVal* para que o
        SharedPreferences seja aplicado na tela que for executado.
            Para usar os mesmo, basta instanciar a classe, com o contexto(geralmente
        this) com um .funções com seus respectivos parâmetros.

            *nomeClasseSharedPreferences*(this).storeString("*NOME_CHAVE*", *info*)

*/