package hangman.model;

public class PowerScore implements GameScore{
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws Exception{
        if(correctCount < 0 || incorrectCount < 0) throw new Exception();

        int puntaje = 0, i;
        for(i = 0; i < correctCount; i++){
            puntaje += Math.pow(5, i);
        }
        puntaje -= incorrectCount * 8;
        if(puntaje > 500){
            return 500;
        }else if(puntaje < 0){
            return 0;
        }else{
            return puntaje;
        }
    }
}
