package hangman.model;

public class BonusScore implements GameScore{

    /**
     *
     * @pos retorna valores mayores o iguales a cero
     * @param correctCount número de letras correctas
     * @param incorrectCount número de letras INcorrectas
     * @return el puntaje
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws Exception{
        if(correctCount < 0 || incorrectCount < 0) throw new Exception();

        int puntaje = correctCount * 10 - incorrectCount * 5;
        if(puntaje > 0){
            return puntaje;
        }else{
            return 0;
        }

    }
}
