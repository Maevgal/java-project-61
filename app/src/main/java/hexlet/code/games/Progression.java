package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static void play() {

        System.out.println("What number is missing in the progression?");
        for (int i = 0; i <= 2; i++) {
            int start = Engine.getRandomInt();
            int dif = Engine.getRandomInt();
            int length = 10;
            int randomIndex = Engine.getRandomInt(length - 1);
            String[] prog = createProgession(start, dif, length);
            int result = Integer.parseInt(prog[randomIndex]);
            prog[randomIndex] = "..";

            Engine.askQuestion(outputProgression(prog));

            int answer = Engine.getAnswerInt();

            if (Engine.checkAnswer(answer, result)) break;

            if (i == 2) {
                Engine.congratulation();
            }
        }
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
