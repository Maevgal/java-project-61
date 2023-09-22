package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int QUESTION_ANSWERS_COUNT = 3;
    public static final int QUESTION_ANSWERS_COLUMN = 2;

    public static void play(String desriptionGame, String[][] questionsAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(desriptionGame);
        for (int i = 0; i < questionsAnswers.length; i++) {
            System.out.println("Question: " + questionsAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(questionsAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was '"
                        + questionsAnswers[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
