//01-02
package Exercicios

import org.junit.Assert
import org.junit.Test

class `01-TestClassEx1&2` (){

    @Test fun revertStrBySB() {
        Assert.assertEquals("retrevni", revertStrBySB("inverter"))
    }

    @Test fun revertStrByLoop(){

        Assert.assertEquals("retrevni", revertStrByLoop("inverter"))
        Assert.assertEquals("o", revertStrByLoop("o"))
    }




    @Test fun countVowels(){
        Assert.assertEquals(7, countVowels("testesecundario"))
    }

    @Test fun countConsonants(){
        Assert.assertEquals(5, countConsonants( "consoante"))

    }

    /*@Test fun countVowelsAndcountConsonants(){
        val phrase="vogais e consoantes"
        Assert.assertEquals(8, countVowels(phrase))
        Assert.assertEquals(9, countConsonants(phrase))
    }*/

    @Test fun countVowelsExe(){
        Assert.assertEquals(7, countVowels("teste secundario"))
    }

    @Test fun countConsonantsExe(){
        Assert.assertEquals(5, countConsonants( "consoante"))

    }
}
/*

@Test fun (){
        Assert.assertEquals("", (""))
        Assert.assertEquals("", (""))
    }
 */