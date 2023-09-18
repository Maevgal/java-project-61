package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Arrays;
import java.util.List;


public final class CalcGame {

    public static void play() {
        List<String> list = Arrays.asList("+", "-", "*");

        System.out.println("What is the result of the expression?");

        for (int i = 0; i <= 2; i++) {
            int random1 = Engine.getRandomInt();
            int random2 = Engine.getRandomInt();
            String randomElement = list.get(Engine.getRandomInt(list.size()));

            int result = calculateResult(randomElement, random1, random2);

            Engine.askQuestion(random1 + " " + randomElement + " " + random2);
            int answer = Engine.getAnswerInt();

            if (Engine.checkAnswer(answer, result)) {
                break;
            }

            if (i == 2) {
                Engine.congratulation();
            }

        }

    }

    private static int calculateResult(String randomElement, int random1, int random2) {
        int result = 0;
        if (randomElement.equals("+")) {
            result = random1 + random2;
        } else if (randomElement.equals("-")) {
            result = random1 - random2;
        } else if (randomElement.equals("*")) {
            result = random1 * random2;
        }
        return result;
    }


}
