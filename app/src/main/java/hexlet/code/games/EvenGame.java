package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    private static final String DESCRIPTION_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAnswers = new String[Engine.QUESTION_ANSWERS_COUNT][Engine.QUESTION_ANSWERS_COLUMN];
        for (int i = 0; i <= 2; i++) {
            int random = Utils.getRandomNumber(Utils.START_RANGE, Utils.END_RANGE);
            questionsAnswers[i][0] = String.valueOf(random);
            questionsAnswers[i][1] = isEven(random) ? "yes" : "no";
        }
        Engine.play(DESCRIPTION_GAME, questionsAnswers);
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
