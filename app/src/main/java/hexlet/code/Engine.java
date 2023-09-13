package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;




    public static String greeting(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

}
