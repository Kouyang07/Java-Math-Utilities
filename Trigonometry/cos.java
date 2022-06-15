package Trigonometry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cos {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static void cos(){
        boolean valid = false;
        double degrees = 0.0;
        while (!valid) {
            System.out.println(ANSI_CYAN + "Enter the number you want the find the COS of" + ANSI_RESET);
            try {
                degrees = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }


        double radians = Math.toRadians(degrees);

        System.out.format(ANSI_GREEN + "The value of pi is %.4f%n", Math.PI);
        System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians) + ANSI_RESET);
    }
}
