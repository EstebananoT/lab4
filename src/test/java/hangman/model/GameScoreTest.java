package hangman.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameScoreTest {

    /**
     * Clases de equivalencia
     * 1. Valores Regulares: Retornos mayores o iguales a 0.
     * 2. Valores Negativos: Valores negativos para cualquier parámetro.
     * 3. Valores Incorrectos: Retornos menores a 0.
     */
    private OriginalScore scoreO;
    @Test
    public void originalScoreTest() {
        scoreO = new OriginalScore();
        int numero = 0;
        try {
            numero = scoreO.calculateScore(10, 11);
            Assert.assertEquals(0, numero);

            numero = scoreO.calculateScore(10, 1);
            Assert.assertEquals(90, numero);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private BonusScore scoreB;
    @Test
    public void calculateScoreBonus(){
        scoreB = new BonusScore();
        int numero = 0;
        try {
            numero = scoreB.calculateScore(1, 10);
            Assert.assertEquals(0, numero);

            numero = scoreB.calculateScore(100, 10);
            Assert.assertEquals(950, numero);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private PowerScore scoreP;
    @Test
    public void calculateScorePower(){
        scoreP = new PowerScore();
        int numero = 0;
        try {
            numero = scoreP.calculateScore(1, 10);
            Assert.assertEquals(0, numero);

            numero = scoreP.calculateScore(100, 10);
            Assert.assertEquals(500, numero);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
