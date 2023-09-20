package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class EvenGame {
    private static final int BOUND = 101;
    private static final String DESCRIPTION_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int QUESTION_ANSWERS_COUNT = 3;
    private static final int QUESTION_ANSWERS_COLUMN = 2;
    public static void play() {
        String[][] questionsAnswers = new String[QUESTION_ANSWERS_COUNT][QUESTION_ANSWERS_COLUMN];
        for (int i = 0; i <= 2; i++) {
            int random = Utils.RANDOM.nextInt(BOUND);
            questionsAnswers[i][0] = String.valueOf(random);
            questionsAnswers[i][1] = isEven(random) ? "yes" : "no";
        }
        Engine.play(DESCRIPTION_GAME, questionsAnswers);
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
