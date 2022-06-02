package Algebra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GCFfinder {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static void GCFfinder() {

        boolean valid = false;
        int gcf1 = 0;
        int gcf2 = 0;
        int gcd = 0;

        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the first number you want to find the GCF of(Numbers only)" + ANSI_RESET);
            try {
                gcf1 = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            System.out.println(ANSI_CYAN + "\nEnter the second number you want to find the GCF of" + ANSI_RESET);
            try {
                gcf2 = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Not a number");
                sc.next();
            }
        }
        for (int i = 1; i <= gcf1 && i <= gcf2; i++) {
            // returns true if both conditions are satisfied
            if (gcf1 % i == 0 && gcf2 % i == 0)
                // storing the variable i in the variable gcd
                gcd = i;
        }
        // prints the gcd
        System.out.printf("GCF of %d and %d is: %d", gcf1, gcf2, gcd);
    }
}
