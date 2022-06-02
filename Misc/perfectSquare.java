package Misc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class perfectSquare {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);

    public static void PerfectSquare() {
        int num2check = 0;
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to check if square root(Numbers only)" + ANSI_RESET);
            try {
                num2check = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }
        // main check
        int sqrt = (int) Math.sqrt(num2check);
        if (sqrt * sqrt == num2check) {
            System.out.println(ANSI_GREEN + num2check + " is a perfect square number! Its square is " + sqrt + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + num2check + " is NOT a perfect square number!" + ANSI_RESET);
        }
    }

}
