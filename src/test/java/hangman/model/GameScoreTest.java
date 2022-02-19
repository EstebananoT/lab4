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
    private OriginalScore score;
    @Test
    public void originalScoreTest() {
        score = new OriginalScore();
        int numero = 0;
        try {
            numero = score.calculateScore(10, 1);
            Assert.assertEquals(90, numero);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void calculateScoreBonus(){

    }
}
