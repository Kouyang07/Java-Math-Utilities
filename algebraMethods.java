import java.util.*;
import java.lang.*;
import java.io.*;

public class algebraMethods {
    // colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static Boolean repeat = false;

    static Scanner sc = new Scanner(System.in);

    // Factor finer method - - - - - - - - - - - - - - - -

    static void factorFinder() {
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
                System.out.println("Not a number.");
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

    static void GCFfinder() {

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
                System.out.println("Not a number.");
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

    static void squareRoot() {
        int sqMain = 0;
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to find the square root of(Numbers only)" + ANSI_RESET);
            try {
                sqMain = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sc.next();
            }
        }
        System.out.println(Math.sqrt(sqMain));
    }

    static void quadratic() {
        boolean valid = false;
        double a = 0;
        double b = 0;
        double c = 0;

        while (!valid) {
            System.out.println(ANSI_CYAN
                    + "\nEnter the A term of the quadratic equation(Numbers only ignore the X, exponent and signs)" + ANSI_RESET);
            try {
                System.out.println("Enter term A");
                a = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sc.next();
            }
            try {
                System.out.println("Enter term B");
                b = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sc.next();
            }
            try {
                System.out.println("Enter term C");
                c = sc.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sc.next();
            }
            double d = b * b - 4.0 * a * c;
            if (d > 0.0) {
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (d == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("Roots are not real.");
            }
        }
    }

    static void exponent() {
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
                System.out.println("Not a number.");
                sc.next();
            }
            try {
                System.out.println(ANSI_CYAN + "\nEnter the power of the number(Number only)" + ANSI_RESET);
                exponent = sc.nextLong();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sc.next();
            }
        }
        // main check
        result = (long) Math.pow(base, exponent);
        System.out.println("result = " + result);

    }

    static void Fac() {
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
                System.out.println("Not a number.");
                return;
            }
        }
        // main check
        for (i = 1; i <= fac; i++) {
            fact = fact * i;
        }
        System.out.println(ANSI_GREEN + "Factorial of " + fac + " is: " + fact + ANSI_RESET);
    }

    static void CR() {
        double result;
        double input = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to calculate the cube root(Numbers only)" + ANSI_RESET);
            try {
                input = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                return;
            }
        }
        // main check
        result = java.lang.Math.cbrt(input);
        System.out.println(ANSI_GREEN + result + ANSI_RESET);
    }

    static void SC() {
        // stores two numbers
        double num1, num2;

        System.out.println("Enter the first number");

        // take the inputs
        num1 = sc.nextDouble();

        System.out.println("Enter the second number");

        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/)");

        char op = sc.next().charAt(0);

        double o = 0;

        switch (op) {

            // case to add two numbers
            case '+':

                o = num1 + num2;

                break;

            // case to subtract two numbers
            case '-':

                o = num1 - num2;

                break;

            // case to multiply two numbers
            case '*':

                o = num1 * num2;

                break;

            // case to divide two numbers
            case '/':

                o = num1 / num2;

                break;

            default:

                System.out.println("You enter wrong input");

                break;
        }

        System.out.println("The answer is:");

        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }

    static void DOTS() {
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
                System.out.println("Not a number.");
                return;
            }
            System.out
                    .println(ANSI_CYAN + "\nEnter the first term of the dot(No exponent or variable, number only)" + ANSI_RESET);
            try {
                term1 = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                return;
            }
            try {
                System.out
                        .println(ANSI_CYAN + "\nEnter the second term of the dot(No exponent or variable, number only)" + ANSI_RESET);
                term2 = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                return;
            }
        }
        //calculation
        double term1f = Math.sqrt(term1);
        double term2f = Math.sqrt(term2);
        System.out.println(ANSI_GREEN + "(" + numVari + "+" + term1f + ")" + "(" + numVari + "-" + term2f + ")" + ANSI_RESET);
    }
    }
