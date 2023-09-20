package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    private static Scanner scanner = new Scanner(System.in);

    public static String greeting() {
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void play(String desriptionGame, String[][] questionsAnswers) {
        greeting();
        System.out.println(desriptionGame);
        for (int i = 0; i < questionsAnswers.length; i++) {
            System.out.println("Question: " + questionsAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(questionsAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '" + questionsAnswers[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        congratulation();
    }

    public static void congratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }
}
