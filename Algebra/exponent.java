package Algebra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exponent {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static void exponent() {
        long base = 0;
        long exponent = 0;
        long result;
        boolean valid = false;

        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the base of the number(Number only)" + ANSI_RESET);
            try {
                base = sc.nextLong();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            try {
                System.out.println(ANSI_CYAN + "\nEnter the power of the number(Number only)" + ANSI_RESET);
                exponent = sc.nextLong();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }
        // main check
        result = (long) Math.pow(base, exponent);
        System.out.println(ANSI_PURPLE + "result = " + result + ANSI_RESET);

    }
}
