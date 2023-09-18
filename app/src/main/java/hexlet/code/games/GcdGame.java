package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GcdGame {
    public static void play() {
        String descriptionGame = "Find the greatest common divisor of given numbers.";
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            Random random = new Random();
            int random1 = random.nextInt(101);
            int random2 = random.nextInt(101);
            int result = calculateGsd(random1, random2);
            answers.add(String.valueOf(result));
            questions.add(random1 + " " + random2);
        }
        Engine.play(descriptionGame, questions, answers);
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
