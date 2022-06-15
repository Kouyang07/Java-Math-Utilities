package Algebra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quadratic {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);

    public static void quadratic() {
        boolean valid = false;
        double a = 0;
        double b = 0;
        double c = 0;

        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the A term of the quadratic equation(Numbers only ignore the X, exponent and signs)" + ANSI_RESET);
            try {
                System.out.println("Enter term A");
                a = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            try {
                System.out.println(ANSI_CYAN + "Enter term B" + ANSI_RESET);
                b = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            try {
                System.out.println(ANSI_CYAN + "Enter term C" + ANSI_RESET);
                c = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            double d = b * b - 4.0 * a * c;
            if (d > 0.0) {
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                System.out.println(ANSI_GREEN + "The roots are " + r1 + " and " + r2 + ANSI_RESET);
            } else if (d == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println(ANSI_GREEN + "The root is " + r1 + ANSI_RESET);
            } else {
                System.out.println(ANSI_GREEN + "Roots are not real." + ANSI_RESET);
            }
        }
    }
}
