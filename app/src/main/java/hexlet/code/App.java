package hexlet.code;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.next());

        if(choice==1){
            System.out.println("Welcome to the Brain Games!");
            Cli.familiarity();
        } else if (choice==2) {
            EvenGame.play();

        } else if (choice==3) {
            Engine.greeting();
            CalcGame.play();
        }


        scanner.close();



    }
}
