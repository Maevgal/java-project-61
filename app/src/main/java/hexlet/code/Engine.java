package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String userName;
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static String greeting() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static int getRandomInt() {
        return random.nextInt(101);
    }

    public static int getRandomInt(int a) {
        return random.nextInt(a);
    }

    public static void askQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public static int getAnswerInt() {
        System.out.print("Your answer: ");
        return scanner.nextInt();
    }

    public static String getAnswerString() {
        System.out.print("Your answer: ");
        return scanner.next();
    }

    public static boolean checkAnswer(int answer, int result) {
        if (answer == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'"
                    + " is wrong answer ;(. Correct answer was '"
                    + result + "'");
            System.out.println("Let's try again, " + userName);

            return true;
        }
        return false;
    }

    public static boolean checkAnswer(String answer, String result) {
        if (answer.equals(result)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'"
                    + " is wrong answer ;(. Correct answer was '"
                    + result + "'");
            System.out.println("Let's try again, " + userName);

            return true;
        }
        return false;
    }
}
