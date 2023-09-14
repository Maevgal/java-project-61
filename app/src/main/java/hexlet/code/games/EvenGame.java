package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.*;

public class EvenGame {
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i <= 2; i++) {
            int random = new Random().nextInt();
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if ((answer.equals("yes") && random % 2 == 0) || (answer.equals("no") && random % 2 != 0)) {
                System.out.println("Correct!");

            } else {
                if (answer.equals("yes")) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }

            }
            if (i==2){
                System.out.println("Congratulations, " + userName + "!");
            }

        }



        scanner.close();


    }
}
