//03
/*
    Estrutura condicional

        if e else:                                                          (ex1)

            cadeia condicional de decisão
            operadores que aceita:
            ==, >, <, >=, <=;

        Operador de Conjunção:
            && = usado quando todas as operações precisão ser verdadeiras;
        Operador de Disjunção:
            || = usado quando uma das operações precisa ser verdadeira;
        Operador de Negação:
            != = usado quando uma das operações precisa ser falsas;


           O tipo de variável boolean retorna sempre true or false, podendo,
        às vezes ser um substituto do if or else                            (ex2)


           Dentro do java existe uma função chamada "operador ternário", que
        substitui o if, else. Aqui um exemplo:

            String str = Valor == 10 ? "Sim" : "Não";
           No exemplo, o "?" substitui a estrutura if.

           Em kotlin, o mesmo pode ser feito, de forma similar:
        val *valDeAtri* = if (*valDeComp* == *valor*) "*texto*" else "*texto*"
                                                                            (ex3)


        Operador Elvis: ?:                                                  (ex4)

            É um possível substituto ao if (*var* == null) que funciona com base em
        uma instrução possivelmente nula. Em caso de essa variável continuar nula, é
        executado a instrução seguinte a ela.

            Exemplo:
            val *valNula*: *tipo*? = null
            println(*valNula* ?: *instrução*)


    Estrutura condicional

        when                                                                (ex5)

            É usado quando se precisa de uma condição específica para que uma
        operação seja feita.
            Ela é definida pela estrutura:
                when (*variávelAssociada*){
                    *condição* -> return *operação*
                    *condição* -> return *operação*
                    *condição* -> return *operação*
                    *condição* -> {
                    *operação*
                    return *operação*
                    }
                    else -> return *valorQualquer*
                }


     Estrutura condicional

         for                                                                (ex6)

            É usado quando se precisa de um loop, finito ou não. Ele é usado
         para iterar (repetir uma ou mais ações) em uma lista.

         for(*variável* in *começo .. fim*){
            *operação*
         }

            A condição sempre esta descrita de x a y (x .. y):
            Na estrutura for, é possível usar o comando : step *valor* , para
         realizar a ação da cadeia a cada X execuções dela.                 (ex7)


         Estrutura condicional
         while e do while                                                   (ex8 && 9)

            É usado quando se precisa de uma execução enquanto uma condição específica
         não foi atingida.
            A estrutura while costuma precisar de ao menos uma variável para sua condição

         while(*var* != *condição*){
            *operação*
         }

            Já a estrutura condicional do while apresenta a mesma funcionalidade, porém
         sempre ira executar ao menos uma vez antes de testar sua condição.

            do{
                *operação*
            }while(*variável* != *condição*)
*//*
    Att 2022

        Return if                                                           (ex10)

            No kotlin a expressão if/else é reconhecida como um comando conjunto
         podendo ser abreviada quando tiver retorno:

            fun *nomeDaFunção*(*variável*:*tipo*) = if (*valor*) {
                *Método*
            } else {
                *Método*
            }

        Operador de comparação                                              (ex11)

            Assim como a negação (!=) e a afirmação(==) é possível inverter uma booleana
         usando o operador: ! .

            if(!*variável*)

            Ao executar um código, o compilador prioriza os operadores na seguinte ordem:

            Parênteses () ;
            Negação ! ;
            Conjunção && ;
            Disjunção || ;

        Do while                                                            (ex12)

            O do while tem uma função bem util de continuar chamando um readLine até
        o valor ser imputado:

            do{
                val *Nome* = readLine()
            }while(*nome* == "")

            Para funcionar a validação via while é preciso ter um if para o null safe,
        descrito abaixo.

        ReadLine                                                            (ex12)

            Sempre ao usar o comando val *nome* = readLine() é importante usar o null
        safety, é uma linha de if a qual impede o código de quebrar

             val *Nome* = readLine()
             if(*nome* != null && *nome* != ""){
             *método*
             }

        Break e Continue                                                    (ex13)

            Break é a palavra reservada que interrompe a execução do laço de
        repetição dela. Ela sempre interrompe um único laço e se aplica a for,
        while e do while.
            O break é um ótimo comando para redução de processamento.

            do{
                *operação*
                if(*condição*){
                    break
                }
            }while(*condição*)

            Continue é a palavra reservada que faz com que o resto do código
        abaixo dela não seja executado, retornando para o começo do laço.

            while(*condição*){
                *operação*
                if(!*condição*){
                    continue
                }
                *operação*
            }

*/


fun maiorOuMenor(idade: Int) {                                              //ex1
    if (idade >= 18) {
        println("É maior de idade!!")
    } else {
        println("Nao e maior de idade")
    }
}

fun maiorOuMenorBoolean(idade: Int): Boolean {                              //ex2
    return idade >= 18
}

fun calculaBonus(salario: Float, cargo: String): Float {                    //ex2
    // Valores aceitos para cargo: Programador jr, Programador sr, Database
    if (cargo == "Database") {
        return salario * 0.4f
    } else if (cargo.contains("Programador")) {
        if (cargo.contains("jr")) {
            return salario * 0.2f
        } else if (cargo.contains("sr")) {
            return salario * 0.6f
        }
    } else {
        println("cargo invalido")
    }
    return salario
}

fun calculaBonusEx(salario: Float, cargo: String): Float {                 //ex2
    return if (cargo == "Database") {
        salario * 0.4f
    } else if (cargo == "Programador jr") {
        salario * 0.2f
    } else {
        salario * 0.6f
    }
}

fun operaçao(a: Int, b: Int, c: String): Int {                              //ex5

    when (c) {
        "soma" -> return a + b
        "subtração" -> return a - b
        "divisão" -> return a / b
        "multiplicação" -> return a * b
        "resto" -> return a % b

        else -> {
            println("operação inválida")
            return 0
        }
    }
}

fun ifReturnTeste(dia: Boolean) = if (!dia) {                           //ex10 && 11
    "noite"
} else {
    "dia"
}


fun main() {

    val valDeComp = 10                                                      //ex3
    val valDeAtri = if (valDeComp == 10) "foi" else "deu ruim"
    println(valDeAtri)

    //Operador Elvis: ?:                                                    //ex4
    val teste: Int? = null
        println(teste ?: 10)

    val str = "joao vitor"                                                  //ex6
    for (c in str) {
        print("$c ")
    }

    println()

    for (i in 100 downTo 0 step 5) {                                  //ex7
        if (i != 50)
            print("$i ")
    }

    println()

    var index = 0                                                           //ex8
    while (index < 100) {
        print("$index ")
        index += 2
        if (index >= 30)
            break
    }

    println()

    var j = 0
    do {
        j += 3
        println(j)
    } while (j > 21)

    maiorOuMenor(idade = 29)                                                //ex9
    maiorOuMenor(idade = 8)
    maiorOuMenor(idade = 18)

    println(maiorOuMenorBoolean(idade = 26))
    println(maiorOuMenorBoolean(idade = 18))
    println(maiorOuMenorBoolean(idade = 4))

    println(calculaBonus(cargo = "Database", salario = 3000f))
    println(calculaBonus(cargo = "Programador jr", salario = 2000f))
    println(calculaBonus(cargo = "Programador sr", salario = 5000f))
    println(calculaBonus(cargo = "designer", salario = 2000f))

    println(calculaBonusEx(cargo = "Database", salario = 3000f))
    println(calculaBonusEx(cargo = "Programador jr", salario = 2000f))
    println(calculaBonusEx(cargo = "Programador sr", salario = 5000f))
    println(calculaBonusEx(cargo = "designer", salario = 2000f))

    println(operaçao(a = 4, b = 5, c = "soma"))
    println(operaçao(a = 10, b = 5, c = "subtração"))
    println(operaçao(a = 10, b = 5, c = "divisão"))
    println(operaçao(a = 4, b = 5, c = "multiplicação"))
    println(operaçao(a = 10, b = 5, c = "resto"))
    println(operaçao(a = 10, b = 5, c = "batata"))


    println(ifReturnTeste(true))                                        //ex10 && 11
    println(ifReturnTeste(!true))


    do {                                                                    //ex12
        val dado = readLine()
        if(dado != null && dado != ""){
            println("$dado")
        }
    } while (dado == "")

    var i = 0                                                               //ex13
    while(true){
        i++
            if(i < 50){
                continue
            }
        print(i)
        if(i > 20){
            break
        }
    }
}
