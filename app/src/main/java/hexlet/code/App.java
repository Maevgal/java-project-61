package hexlet.code;

import hexlet.code.games.*;

import java.io.IOException;
import java.util.Scanner;

public class App {
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

        if (choice == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.familiarity();
        } else if (choice == 2) {
            Engine.greeting();
            EvenGame.play();
        } else if (choice == 3) {
            Engine.greeting();
            CalcGame.play();
        } else if (choice == 4) {
            Engine.greeting();
            GcdGame.play();
        } else if (choice == 5) {
            Engine.greeting();
            Progression.play();
        } else if (choice == 6) {
            Engine.greeting();
            PrimeGame.play();
        }


        scanner.close();


    }
}
