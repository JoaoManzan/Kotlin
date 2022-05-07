/*
    Git

        Git Bash

            O Git Bash é um prompt de comando usado para comandos do git, uma vantagem dele
        é ter distinção de cores entre comandos.
            Caso já possua uma pasta e queira transforma-la em repositório, basta clicar com
        o botão direito + open bash here e será iniciado nela a pasta master.

        Commit

            Commit é o comando usado para salvar uma mudança ja adicionada ao git.
            O commit tem 3 etapas, o working, que é a pasta onde estão os arquivos, as
        modificações adicionadas e não commitadas chamadas de "staged", salvas naquele estado
        independente de modificações posteriores no mesmo arquivo, e as salvas na master.

        Git Log

            O comando git log permite ver um histórico de todos os commits no projeto, com um
        número único atrelado a cada commit, para ser identificável, também chamados xa.

        Git ignore

            Para ignorar algum item da pasta, é preciso ir ao cmd > acessar o diretório >
        ren *nome.TipoArquivo* .gitignore , assim será criado um arquivo de texto onde será
        inserido os arquivos, pastas ou tipos de arquivos a serem ignorados
            É possível entrar no site github.com/github/gitignore para uma lista de arquivos
        a serem ignorados para cada tipo e linguagem de projeto base.

    Comandos Git Ignore

        *nome.TipoArquivo*                        Ignora o arquivo explicitado.
        *.*TipoArquivo*                           Ignora o tipo de arquivo explicitado.
        *nomePasta* /                             Ignora os arquivos na pasta explicitada.
        *nomePasta* /.*TipoArquivo*               Ignora os arquivos de um tipo na pasta.

        Git clone

            É um comando que clona um repositório, seja local ou do GitHub, para isso
    Comandos

        clear                                     Limpar a tela.
        git config --global user.name "*nome*"    Mudar o nome do usuário.
        git config --global user.email "*email*"  Mudar o e-mail do usuário.
        cd *nome* /                               Entra na pasta.
        --                                        Volta uma pasta.
        dir -a                                    Mostra os arquivos na pasta alocada.
        git init                                  Inicializa o git.
        git status                                Mostra o estado do arquivo.
        git add ...                               Adiciona ao git ...
        git add *nomeArquivo* (+Tab)              Adiciona ao git *nomeArquivo*.
        git add -all                              Adiciona ao git todos os arquivos da pasta.
        git add -A                                Adiciona ao git todos os arquivos da pasta.
        git add .                                 Adiciona ao git todos os arquivos da pasta.
        git commit -m *nomeArquivo*               Adiciona o arquivo na branch master.
        git diff                                  Mostra as diferenças entre versões.
        git diff --cached                         Mostra as diferenças entre areas de preparo.
        git diff --staged                         Mostra as diferenças entre areas staged.
        git log                                   Mostra o histórico de commits.
        git log --oneline                         Mostra o histórico de commits em uma linha.
        git checkout *xaNumber(5-8)*              Volta ao commit especificado.
        git checkout master                       Volta ao último commit.
        git checkout *nomeArquivo*                Volta ao último estado do arquivo.
        git reset                                 Mostra as diferenças para a master.
        git reset --hard                          Volta ao estado da master.
        git clean                                 Limpa.
        git clean -f                              Limpa o working directory.
        git clone *nomePasta* / *novaPasta*       Clona o repositório para uma nova pasta.
        git clone https://github.com/ *link*      Clona o repositório do link para uma pasta.





    GitHub

            O GitHub é um serviço onde é possível gerenciar, armazenar e versionar
        repositórios, funcionando, geralmente, em conjunção ao git.





 */
