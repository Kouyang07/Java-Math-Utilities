import java.util.*;
import java.lang.*;

public class calculator {
    // colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static Boolean repeat = false;

    // Factor finer method - - - - - - - - - - - - - - - -

    static void factorFinder() {
        Scanner sc = new Scanner(System.in);
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
        Scanner gcff = new Scanner(System.in);
        boolean valid = false;
        int gcf1 = 0;
        int gcf2 = 0;
        int gcd = 0;

        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the first number you want to find the GCF of(Numbers only)" + ANSI_RESET);
            try {
                gcf1 = gcff.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                gcff.next();
            }
            System.out.println(ANSI_CYAN + "\nEnter the second number you want to find the GCF of" + ANSI_RESET);
            try {
                gcf2 = gcff.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Not a number");
                gcff.next();
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
        Scanner sq = new Scanner(System.in);
        int sqMain = 0;
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to find the square root of(Numbers only)" + ANSI_RESET);
            try {
                sqMain = sq.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sq.next();
            }
        }
        System.out.println(Math.sqrt(sqMain));
    }

    static void PerfectSquare() {
        Scanner ps = new Scanner(System.in);
        int num2check = 0;
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to check if square root(Numbers only)" + ANSI_RESET);
            try {
                num2check = ps.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                ps.next();
            }
        }
        //main check
        int sqrt = (int) Math.sqrt(num2check);
        if (sqrt * sqrt == num2check) {
            System.out.println(ANSI_GREEN + num2check + " is a perfect square number!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + num2check + " is NOT a perfect square number!" + ANSI_RESET);
        }
    }
    static void quadratic() {
        Scanner quad = new Scanner(System.in);
        boolean valid = false;
        double a = 0;
        double b = 0;
        double c = 0;



        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the A term of the quadratic equation(Numbers only ignore the X, exponent and signs)" + ANSI_RESET);
            try {
                System.out.println("Enter term A");
                a = quad.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                quad.next();
            }
            try {
                System.out.println("Enter term B");
                b = quad.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                quad.next();
            }
            try {
                System.out.println("Enter term C");
                c = quad.nextDouble();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                quad.next();
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
        Scanner expo = new Scanner(System.in);
        long base = 0;
        long exponent = 0;
        long result;
        boolean valid = false;

        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the base of the number(Number only)" + ANSI_RESET);
            try {
                base = expo.nextLong();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                expo.next();
            }
            try {
                System.out.println(ANSI_CYAN + "\nEnter the power of the number(Number only)" + ANSI_RESET);
                exponent = expo.nextLong();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                expo.next();
            }
        }
        //main check
        result= (long) Math.pow(base, exponent);
        System.out.println("result = "+result);

    }

    static void Fac() {
        int fac = 0;
        int i, fact = 1;
        Scanner factorial = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to calculate the factorial of(Numbers only)" + ANSI_RESET);
            try {
                fac = factorial.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                return;
            }
        }
        //main check
        for(i=1;i<=fac;i++)
        {
            fact=fact*i;
        }
        System.out.println(ANSI_GREEN + "Factorial of "+fac+" is: "+fact + ANSI_RESET);
    }
    static void CR() {
        double result;
        double input = 0.0;
        Scanner cr = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            System.out.println(ANSI_CYAN + "\nEnter the number you want to calculate the cube root(Numbers only)" + ANSI_RESET);
            try {
                input = cr.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                return;
            }
        }
        //main check
        result = java.lang.Math.cbrt(input);
        System.out.println(ANSI_GREEN + result + ANSI_RESET);
    }

    // Driver - - - - - - - - - - - - - - - - - - - -



    public static void main(String[] args) {
        do {
            Scanner choiceScanner = new Scanner(System.in);
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Factor/GCF/SQR/PS/Quad)" + "\nFactor = Find the factor of a number" + "\nGCF = Find the greatest common factor of a number" + "\nSQR = Find the square root of a number" + "\nPS = Check if the number is a perfect square" + "\nQuad = Solve a quadratic equation" + "\nExpo = Evaluate the given exponent" + "\nFac = Factorial of a given number" + "CR = Cube root of a given number"+ ANSI_RESET);
            String answer = choiceScanner.nextLine();
            // if the input is y, set repeat program to true otherwise exit
            if (answer.equalsIgnoreCase("Factor")) {
                factorFinder();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("GCF")) {
                GCFfinder();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("SQR")) {
                squareRoot();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("PS")) {
                PerfectSquare();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Expo")) {
                exponent();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Quad")) {
                quadratic();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Fac")) {
                Fac();
            }
            if (answer.equalsIgnoreCase("CR")) {
                CR();
            }
            else {
                System.out.println("\nThe choice you entered is invalid. Pick one from below");
            }
            repeat = true;
        } while (true);
    }
}