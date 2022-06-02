package Algebra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fac {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static void Fac() {
        int fac = 0;
        int i, fact = 1;
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to calculate the factorial of(Numbers only)" + ANSI_RESET);
            try {
                fac = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }
        // main check
        for (i = 1; i <= fac; i++) {
            fact = fact * i;
        }
        System.out.println(ANSI_GREEN + "Factorial of " + fac + " is: " + fact + ANSI_RESET);
    }
}
