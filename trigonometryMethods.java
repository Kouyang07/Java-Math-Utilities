import java.util.*;
import java.lang.*;
import java.io.*;

public class trigonometryMethods {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);

    static void cos(){
        boolean valid = false;
        double degrees = 0.0;
        while (!valid) {
            System.out.println(ANSI_PURPLE + "Enter the number you want the find the COS of" + ANSI_RESET);
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

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
    }

    static void PT(){
        double firstS = 0;
        double secondS = 0;
        double hypotenuse = 0;
        boolean valid = false;
        double fBase = 0;
        double sBase = 0;

        while (!valid) {
            try {
                System.out.println(ANSI_PURPLE + "Enter the first leg of the triangle" + ANSI_RESET);
                fBase = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
            try {
                System.out.println(ANSI_PURPLE + "Enter the second leg of the triangle" + ANSI_RESET);
                sBase = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }

        firstS = fBase * fBase;
        secondS = sBase * sBase;
        hypotenuse = Math.sqrt(firstS + secondS);

        System.out.println(ANSI_GREEN + "The hypotenus of " + fBase + " and " + sBase + " is " + hypotenuse + ANSI_RESET);

    }
}
