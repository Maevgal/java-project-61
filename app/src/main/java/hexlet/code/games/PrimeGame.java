package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    private static final String DESCRIPTION_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAnswers = new String[Engine.QUESTION_ANSWERS_COUNT][Engine.QUESTION_ANSWERS_COLUMN];
        for (int i = 0; i <= 2; i++) {
            int random = Utils.getRandomNumber(Utils.START_RANGE, Utils.END_RANGE);
            questionsAnswers[i][0] = String.valueOf(random);
            questionsAnswers[i][1] = isPrime(random) ? "yes" : "no";
        }
        Engine.play(DESCRIPTION_GAME, questionsAnswers);
    }

    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
