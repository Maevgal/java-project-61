package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.List;

public final class CalcGame {
    private static final List<String> OPERATORS = List.of("+", "-", "*");
    private static final String DESCRIPTION_GAME = "What is the result of the expression?";

    public static void play() {
        String[][] questionsAnswers = new String[Engine.QUESTION_ANSWERS_COUNT][Engine.QUESTION_ANSWERS_COLUMN];
        for (int i = 0; i <= 2; i++) {
            int random1 = Utils.getRandomNumber(Utils.START_RANGE, Utils.END_RANGE);
            int random2 = Utils.getRandomNumber(Utils.START_RANGE, Utils.END_RANGE);
            String randomElement = OPERATORS.get(Utils.RANDOM.nextInt(OPERATORS.size()));
            questionsAnswers[i][0] = random1 + " " + randomElement + " " + random2;
            questionsAnswers[i][1] = String.valueOf(calculateResult(randomElement, random1, random2));
        }
        Engine.play(DESCRIPTION_GAME, questionsAnswers);
    }

    private static int calculateResult(String operator, int firstOperand, int secondOperand) {
        return switch (operator) {
            case "+" -> firstOperand + secondOperand;
            case "-" -> firstOperand - secondOperand;
            case "*" -> firstOperand * secondOperand;
            default -> throw new RuntimeException("Operation " + operator + " not supported.");
        };
    }
}
