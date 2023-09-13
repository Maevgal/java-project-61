package hexlet.code;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public final class CalcGame {

    public static void play() {
        List<String> list = Arrays.asList("+", "-", "*");
        Random rand = new Random();
        String randomElement = list.get(rand.nextInt(list.size()));
        int result = 0;
        Scanner scanner = new Scanner(System.in);


        //Engine.greeting();
        /*System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");*/

        System.out.println("What is the result of the expression?");

        for (int i = 0; i <= 2; i++) {

            int random1 = new Random().nextInt(101);
            int random2 = new Random().nextInt(101);

            System.out.println("Question: " + random1 + " " + randomElement + " " + random2);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            //вычисляем результат
            if (randomElement.equals("+")) {
                result = random1 + random2;
            } else if (randomElement.equals("-")) {
                result = random1 - random2;
            } else if (randomElement.equals("*")) {
                result = random1 * random2;
            }

            //сравниваем ответ

            if (Integer.parseInt(answer) == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was '"
                        + result + "'");
                System.out.println("Let's try again, " + Engine.userName);

                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }


        }
        scanner.close();
    }


}
