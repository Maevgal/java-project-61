package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    public static void play() {

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i <= 2; i++) {
            int random1 = Engine.getRandomInt();
            int random2 = Engine.getRandomInt();

            int result = calculateGsd(random1, random2);

            Engine.askQuestion(random1 + " " + random2);
            int answer = Engine.getAnswerInt();

            if (Engine.checkAnswer(answer, result)) break;

            if (i == 2) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }
        }
    }

    public static int calculateGsd(int a, int b) {
        int c = 0;
        int max = a >= b ? a : b;
        int min = a <= b ? a : b;

        while (true) {
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
