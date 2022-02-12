package hangman.model;

public interface GameScore {

    default int calculateScore(int correctCount, int incorrectCount) throws Exception{
        return 0;
    }
}
