package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void play() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i <= 2; i++) {
            int random = Engine.getRandomInt();

            Engine.askQuestion(String.valueOf(random));

            String answer = Engine.getAnswerString();

            String result = calculateGsd(random) ? "yes" : "no";

            if (Engine.checkAnswer(answer, result)) break;

            if (i == 2) {
                Engine.congratulation();
            }
        }
    }

    public static boolean calculateGsd(int a){
        if(a<2){
            return false;
        }
        for (int i = 2; i*i <=a ; i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
