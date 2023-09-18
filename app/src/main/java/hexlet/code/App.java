package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.Progression;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case GREET -> {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
            }
            case EVEN -> {
                Engine.greeting();
                EvenGame.play();
            }
            case CALC -> {
                Engine.greeting();
                CalcGame.play();
            }
            case GCD -> {
                Engine.greeting();
                GcdGame.play();
            }
            case PROGRESSION -> {
                Engine.greeting();
                Progression.play();
            }
            case PRIME -> {
                Engine.greeting();
                PrimeGame.play();
            }
        }
        scanner.close();
    }
}
