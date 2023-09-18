package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Progression {
    public static final int LENGTH = 10;

    public static void play() {
        String descriptionGame = "What number is missing in the progression?";
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            Random random = new Random();
            int start = random.nextInt(101);
            int dif = random.nextInt(101);
            int length = LENGTH;
            int randomIndex = random.nextInt(length - 1);
            String[] prog = createProgession(start, dif, length);
            answers.add(prog[randomIndex]);
            prog[randomIndex] = "..";
            questions.add(outputProgression(prog));
        }
        Engine.play(descriptionGame, questions, answers);
    }

    private static String[] createProgession(int start, int dif, int length) {
        String[] progression = new String[length];
        //формирование прогрессии
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(start + i * dif);
        }
        return progression;
    }

    private static String outputProgression(String[] progression) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            str.append(progression[i] + " ");
        }
        return String.valueOf(str);
    }


}
