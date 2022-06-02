package Algebra;

import java.util.InputMismatchException;
import java.util.Scanner;


public class factorFinder {
    // colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static Scanner sc = new Scanner(System.in);
    public static void factorFinder() {
        boolean valid = false;
        int number = 0;

        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the number you want to find the factor of(Numbers only)" + ANSI_RESET);
            try {
                number = sc.nextInt();
                valid = true;
                // catches the mismatch exception so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.print(ANSI_GREEN + i + " " + ANSI_RESET);
            }
        }
    }
}
