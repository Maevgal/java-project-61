package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvenGame {

    public static final int BOUND = 101;

    public static void play() {
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        String descriptionGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (int i = 0; i <= 2; i++) {
            Random random = new Random();
            int random1 = random.nextInt(BOUND);
            questions.add(String.valueOf(random1));
            answers.add(random1 % 2 == 0 ? "yes" : "no");
        }
        Engine.play(descriptionGame, questions, answers);
    }
}
