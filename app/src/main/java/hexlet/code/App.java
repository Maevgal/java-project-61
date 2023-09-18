package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.Progression;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static final int EXIT = 0;
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
            case GREET -> Cli.greeting();
            case EVEN -> EvenGame.play();
            case CALC -> CalcGame.play();
            case GCD -> GcdGame.play();
            case PROGRESSION -> Progression.play();
            case PRIME -> PrimeGame.play();
            case EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("There is no such game. Goodbye!");
        }
        scanner.close();
    }
}
