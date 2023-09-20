package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.List;

public final class CalcGame {

    private static final int BOUND = 101;
    private static final List<String> OPERATORS = List.of("+", "-", "*");
    private static final String DESCRIPTION_GAME = "What is the result of the expression?";
    private static final int QUESTION_ANSWERS_COUNT = 3;
    private static final int QUESTION_ANSWERS_COLUMN = 2;
    public static void play() {
        String[][] questionsAnswers = new String[QUESTION_ANSWERS_COUNT][QUESTION_ANSWERS_COLUMN];
        for (int i = 0; i <= 2; i++) {
            int random1 = Utils.RANDOM.nextInt(BOUND);
            int random2 = Utils.RANDOM.nextInt(BOUND);
            String randomElement = OPERATORS.get(Utils.RANDOM.nextInt(OPERATORS.size()));
            questionsAnswers[i][0] = random1 + " " + randomElement + " " + random2;
            questionsAnswers[i][1] = String.valueOf(calculateResult(randomElement, random1, random2));
        }
        Engine.play(DESCRIPTION_GAME, questionsAnswers);
    }

    private static int calculateResult(String randomElement, int random1, int random2) {
        return switch (randomElement) {
            case "+" -> random1 + random2;
            case "-" -> random1 - random2;
            case "*" -> random1 * random2;
            default -> throw new RuntimeException("Operation " + randomElement + " not supported.");
        };
    }
}
