package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    private static final int BOUND = 101;
    private static final String DESCRIPTION_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAnswers = new String[3][2];
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
