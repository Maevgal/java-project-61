package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeGame {

    public static final int BOUND = 101;

    public static void play() {
        String descriptionGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            Random random = new Random();
            int random1 = random.nextInt(BOUND);
            questions.add(String.valueOf(random1));
            answers.add(calculateGsd(random1) ? "yes" : "no");
        }
        Engine.play(descriptionGame, questions, answers);
    }

    public static boolean calculateGsd(int a) {
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
