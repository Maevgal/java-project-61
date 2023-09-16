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

        if (choice == GREET) {
            System.out.println("Welcome to the Brain Games!");
            Cli.familiarity();
        } else if (choice == EVEN) {
            Engine.greeting();
            EvenGame.play();
        } else if (choice == CALC) {
            Engine.greeting();
            CalcGame.play();
        } else if (choice == GCD) {
            Engine.greeting();
            GcdGame.play();
        } else if (choice == PROGRESSION) {
            Engine.greeting();
            Progression.play();
        } else if (choice == PRIME) {
            Engine.greeting();
            PrimeGame.play();
        }


        scanner.close();


    }
}
