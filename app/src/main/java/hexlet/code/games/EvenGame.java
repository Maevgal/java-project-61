package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    public static void play() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i <= 2; i++) {
            int random = Engine.getRandomInt();

            Engine.askQuestion(String.valueOf(random));

            String answer = Engine.getAnswerString();

            String result = random % 2 == 0 ? "yes" : "no";

            if (Engine.checkAnswer(answer, result)) break;

            if (i == 2) {
                Engine.congratulation();
            }
        }
    }
}
