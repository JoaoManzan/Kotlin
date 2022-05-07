//02
package Exercicios

fun countVowels(phrase:String ):Int{
    var counter:Int = 0
    var char:String
    //var SB = StringBuilder()
    var i = phrase.length - 1
    do{
        //SB.append(phrase[i])
        char= phrase[i].toString()
        if(char== "a" || char== "e" || char== "i" || char== "o" || char== "u" ){
            counter++
            if(char==" "){
                counter--
        }}
        i--
    }while(i >= 0)

    return counter
    }


fun countConsonants(phrase:String):Int{
        var counter:Int
        counter = countVowels(phrase)
        counter = phrase.length - counter
    return counter
    }

/*
fun countVowelsAndcountConsonants(phrase:String):String{
     var counter:Int
     val vowel:Int
        counter = countVowels(phrase)
        vowel = counter
        counter = phrase.length - counter
    return counter vowel - 2
    }

 */

fun countVowelsExe(phrase:String):Int{
    var counter=0
    val vowel = "aeiou"
    for (letter in phrase)
        if (letter.lowercaseChar() in vowel) counter++
    return counter
}
fun countConsonantsExe(phrase:String):Int{
    var counter=0
    val consonant = "bcdfghjklmnpqrstvwxyz"
    for (letter in phrase)
        if (letter in consonant) counter++
            return counter
}


