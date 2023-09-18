package hexlet.code;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String userName;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static String greeting() {
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void play(String desriptionGame, List<String> questions, List<String> answers) {
        greeting();
        System.out.println(desriptionGame);
        for (int i = 0; i < questions.size(); i++) {
            askQuestion(questions.get(i));
            String userAnswer = getUserAnswerString();
            if (isNotCorrectAnswer(userAnswer, answers.get(i))) {
                return;
            }
        }
        congratulation();

    }

    public static void askQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public static String getUserAnswerString() {
        System.out.print("Your answer: ");
        return scanner.next();
    }

    public static boolean isNotCorrectAnswer(String answer, String result) {
        if (answer.equals(result)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'"
                    + " is wrong answer ;(. Correct answer was '"
                    + result + "'");
            System.out.println("Let's try again, " + userName + "!");

            return true;
        }
        return false;
    }

    public static void congratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }
}
