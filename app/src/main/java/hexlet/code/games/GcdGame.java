package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GcdGame {
    private static final int BOUND = 101;
    private static final String DESCRIPTION_GAME = "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] questionsAnswers = new String[3][2];
        for (int i = 0; i <= 2; i++) {
            int random1 = Utils.RANDOM.nextInt(BOUND);
            int random2 = Utils.RANDOM.nextInt(BOUND);
            int result = calculateGsd(random1, random2);
            questionsAnswers[i][1] = String.valueOf(result);
            questionsAnswers[i][0] = random1 + " " + random2;
        }
        Engine.play(DESCRIPTION_GAME, questionsAnswers);
    }

    public static int calculateGsd(int a, int b) {
        int c = 0;
        int max = a >= b ? a : b;
        int min = a <= b ? a : b;
        while (true) {
            if (min == 0) {
                return max;
            }
            c = max % min;
            if (c == 0) {
                return min;
            } else {
                max = min;
                min = c;
            }
        }
    }
}
