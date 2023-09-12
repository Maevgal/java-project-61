package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.next());

        if(choice==1){
            System.out.println("Welcome to the Brain Games!");
            Cli.familiarity();
        } else if (choice==2) {
            EvenGame.play();

        }


        scanner.close();



    }
}
