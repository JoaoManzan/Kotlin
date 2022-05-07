// 01
// No Kotlin existem 2 tipos de variáveis: var e val

// var(variable) é a usada para uma variável que sera alterada;
// val(value) é usada sempre para uma variável fixa;

// Uma val ou uma var nunca pode ter apenas o nome da variável, ela
// necessita de mais uma informação, ou tipo ou valor;

// var e val não aceitam caracteres especiais no nome da variável;
// Para designar tipo de var ou val, usar letra maiúscula no início;


// Tipos de var e val:
//      Double e Float(números com decimais, 64 e 32 bits respct.)
//      Byte, Short, Int, Long (8, 16, 32, 64 bits respct.)
//      Boolean (True or false, 1-8 bits)
//      Char e String (1-8 bits e 2-? bits(quantos necessário))


//  String: É possível unir strings com qualquer outra variável em string,
//  de duas maneiras ao usar o println:
//      Sem as aspas, somando com o +  ;
//      Com as aspas, usando o $ prévio a variável, podendo também adicionar
//      qualquer texto junto;

//  É possível também alocar uma string em blocos de parágrafos usando o
//  comando: """ *texto* """  ;



// No Kotlin é possível fazer operações dentro da função println, basta
// coloca-la dentro na seguinte estrutura:  "*texto* ${*operação*}"  , com
// cifrão e chaves, iniciada e terminada por aspas;


// fun é o comando usado para delimitar uma função que pode ser usada
// varias vezes durante a execução;

// Para delimitar uma função, use:
//          fun *nomeDaFunção*(*variável*: *tipo*) : *tipoDeSaida(seHouver)* {
//          *código* }

// Outra opção para funções curtas é:
//          fun *nomeDaFunção*(*variável*: *tipo*) = *operaçãoCurta*

// No caso de a função retornar valor, use o comando: return antes do
// valor a retornar;

// Para usar a função, use:
// *nomedaFunção*(*variável*, *variável2*, *variável3*)


/* Operações básicas:
            + (soma), - (subtração);
            * (multiplicação), / (divisão);
            % (restoDaDivisão);


            *var*++ (*var* = *var* + 1(operaciona depois
            da execução da variável));
            *var*-- (*var* = *var* - 1(operaciona depois
            da execução da variável));

            ++*var* (*var* = *var* + 1(operaciona antes
            da execução da variável));
            --*var* (*var* = *var* - 1(operaciona antes
            da execução da variável));


            *var* += *valor* (*var* = *var* + *valor*)
            *var* -= *valor* (*var* = *var* - *valor*)
            *var* *= *valor* (*var* = *var* * *valor*)
            *var* /= *valor* (*var* = *var* / *valor*)
            *var* %= *valor* (*var* = *var* % *valor*)

*/



fun escreverTexto(nome:String, genero: Char, idade: Int )  {
    return println("nome:$nome genero:$genero idade:$idade")
}
fun escreverTexto(descritivo: String) = descritivo.length

fun main() {


    var nome = "Joao vitor"
    var idade = 26
    var idade2: Float = 26.6f
    var genero: Char = 'M'
    val w= 2
    val e: Int
    val descritivo = """
        |nome: Joao
        |genero: M
        |Idade: 26
        |""".trimMargin()


    println(nome + genero + idade)
    println("nome:$nome genero:$genero idade:$idade")

    println(descritivo)
    println("seu nome tem ${nome.length} caracteres")

    escreverTexto(nome, genero, idade)
    println ("o total de caracteres é de:")
    println(escreverTexto(descritivo))

    println("Operaçoes com sua idade")
    idade+=6
    println(idade)
    idade-=4
    println(idade)
    idade*=2
    println(idade)
    idade/=4
    println(idade)
    idade%=2
    println(idade)

    println("10 Pontos para a Grifinória!")

}
