//01
package Exercicios

import java.lang.StringBuilder

/*
    Exercício 1:
        Crie um código que inverta uma string.

*/



     fun revertStrBySB(str:String):String {
        return StringBuilder(str).reverse().toString()
    }

    fun revertStrByLoop(str:String): String{
        var loopString = StringBuilder()
        var i = str.length - 1

        do{
            loopString.append(str[i])
            i--
        }while(i >= 0)

        return loopString.toString()
    }


/*
fun main (){
    val char:CharSequence
    input
    var str=char

    var i:Char
    var size:Int= str.length
    i== str.startsWith
    do{
       arrayOf( )


       size--
    }while( size > 0)

} */