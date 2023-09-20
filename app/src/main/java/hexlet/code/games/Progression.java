package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int LENGTH = 10;
    private static final int BOUND = 101;
    private static final String DESCRIPTION_GAME = "What number is missing in the progression?";

    public static void play() {
        String[][] questionsAnswers = new String[3][2];
        for (int i = 0; i <= 2; i++) {
            int start = Utils.RANDOM.nextInt(BOUND);
            int dif = Utils.RANDOM.nextInt(BOUND);
            int length = LENGTH;
            int randomIndex = Utils.RANDOM.nextInt(length - 1);
            int[] prog = createProgession(start, dif, length);
            questionsAnswers[i][1] = String.valueOf(prog[randomIndex]);
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < prog.length; j++) {
                if (j == randomIndex) {
                    str.append(".. ");
                } else {
                    str.append(prog[j] + " ");
                }
            }
            questionsAnswers[i][0] = String.valueOf(str);
        }
        Engine.play(DESCRIPTION_GAME, questionsAnswers);
    }

    private static int[] createProgession(int start, int dif, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = start + i * dif;
        }
        return progression;
    }
}
