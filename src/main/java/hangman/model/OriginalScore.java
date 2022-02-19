package hangman.model;

public class OriginalScore implements GameScore{
    /**
     *
     * @pos retorna valores mayores o iguales a cero
     * @param correctCount número de letras correctas
     * @param incorrectCount número de letras INcorrectas
     * @return el puntaje
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws Exception {
        if(correctCount < 0 || incorrectCount < 0) throw new Exception();
        int puntaje = 100;
        if(incorrectCount > 10){
            return 0;
        }else{
            return puntaje - 10 * incorrectCount;

        }
    }
}
