package Algebra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DOTS {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);

    public static void DOTS() {
        boolean valid = false;
        int term1 = 0;
        int term2 = 0;
        String numVari = "x";

        System.out
                .println(ANSI_CYAN + "\nBefore you use this, make sure the sign between the 2 terms are -)" + ANSI_RESET);

        while (!valid) {
            try {
                System.out.println(ANSI_CYAN + "\nEnter the variable(s) of the binomial" + ANSI_RESET);
                numVari = sc.nextLine();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            System.out
                    .println(ANSI_CYAN + "\nEnter the first term of the dot(No exponent or variable, number only)" + ANSI_RESET);
            try {
                term1 = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            try {
                System.out
                        .println(ANSI_CYAN + "\nEnter the second term of the dot(No exponent or variable, number only)" + ANSI_RESET);
                term2 = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }
        //calculation
        double term1f = Math.sqrt(term1);
        double term2f = Math.sqrt(term2);
        System.out.println(ANSI_GREEN + "(" + numVari + "+" + term1f + ")" + "(" + numVari + "-" + term2f + ")" + ANSI_RESET);
    }
}
