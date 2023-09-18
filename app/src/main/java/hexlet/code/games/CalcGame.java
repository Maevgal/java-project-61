package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class CalcGame {
    public static void play() {
        List<String> list = List.of("+", "-", "*");
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        String desriptionGame = "What is the result of the expression?";

        for (int i = 0; i <= 2; i++) {
            Random random = new Random();
            int random1 = random.nextInt(101);
            int random2 = random.nextInt(101);
            String randomElement = list.get(random.nextInt(list.size()));
            answers.add(calculateResult(randomElement, random1, random2));
            questions.add(random1 + " " + randomElement + " " + random2);
        }
        Engine.play(desriptionGame, questions, answers);
    }

    private static String calculateResult(String randomElement, int random1, int random2) {
        int result = 0;
        if (randomElement.equals("+")) {
            result = random1 + random2;
        } else if (randomElement.equals("-")) {
            result = random1 - random2;
        } else if (randomElement.equals("*")) {
            result = random1 * random2;
        }
        return String.valueOf(result);
    }
}
