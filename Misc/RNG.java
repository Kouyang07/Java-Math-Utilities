package Misc;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RNG {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);

    public static void RNG() {
        int highest = 0;
        int total = 0;
        boolean valid = false;
        try {
            System.out.println(ANSI_CYAN + "Enter the amount of numbers you want to generate" + ANSI_RESET);
            total = sc.nextInt();
            valid = true;
            // catches the mismatch exception, so it will only take int input. If letter
            // return Not a number
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
            sc.next();
        }
        try {
            System.out.println(ANSI_CYAN + "Enter the highest number(1-x)" + ANSI_RESET);
            highest = sc.nextInt();
            valid = true;
            // catches the mismatch exception, so it will only take int input. If letter
            // return Not a number
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
            sc.next();
        }


        Random num = new Random();
        int res = 0;
        for (int i = 1; i <= total; i++) {
            res = 1 + num.nextInt(highest);
            System.out.println(ANSI_GREEN + res + ANSI_RESET);
        }
    }
}
