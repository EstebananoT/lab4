package hangman.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameScoreTest {

    /**
     * Clases de equivalencia para OriginalScore
     * 1. Valores Regulares: Retornos mayores o iguales a 0
     * 2. Valores Incorrectos: Valores negativos para cualquier parámetro
     * 3. Valores :Retornos menores a 0
     */
    private OriginalScore o;
    @Test
    public void originalScoreTest() {
        try{
            System.out.println(o.calculateScore(4,7));
            assertEquals(o.calculateScore(4,7) ,30);
        }catch (Exception e){
            System.out.println("SOUDAPUTA");
        }
    }
}
