import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static Boolean repeat = false;

    public static void main(String[] args) {
        do {
            System.out.println(
                    ANSI_PURPLE + "Do you want statics mode or algebra mode?" + "\nAlgebra = Sets of calculator for Algebra problems"
                            + "\nStat = Sets of statistic calculators" + ANSI_RESET);
            String mainChoice = sc.nextLine();
            if (mainChoice.equalsIgnoreCase("Algebra")) {
                algebraMethods();
            } else if (mainChoice.equalsIgnoreCase("Stat")) {
                statisticMethods();
            } else {
                System.out.println("The choices you entered is invalid. Pick simple or adv");
            }
        } while (true);
    }

    static void algebraMethods() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Factor/GCF/SQR/PS/Quad/CR/SC/DOTS)"
                    + "\nFactor = Find the factor of a number" + "\nGCF = Find the greatest common factor of a number"
                    + "\nSQR = Find the square root of a number" + "\nPS = Check if the number is a perfect square and return the square root"
                    + "\nQuad = Solve a quadratic equation" + "\nExpo = Evaluate the given exponent"
                    + "\nFac = Factorial of a given number"
                    + "\nCR = Cube root of a given number" + "\nSC = Simple calculator to calculate simple 2 term equations"
                    + "\nDOTS = Difference Between Two Squares" + ANSI_RESET);
            String answer = sc.nextLine();
            // if the input is y, set repeat program to true otherwise exit
            if (answer.equalsIgnoreCase("Factor")) {
                algebraMethods.factorFinder();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("GCF")) {
                algebraMethods.GCFfinder();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("SQR")) {
                algebraMethods.squareRoot();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("PS")) {
                algebraMethods.PerfectSquare();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Expo")) {
                algebraMethods.exponent();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Quad")) {
                algebraMethods.quadratic();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Fac")) {
                algebraMethods.Fac();
            }
            if (answer.equalsIgnoreCase("CR")) {
                algebraMethods.CR();
            }
            if (answer.equalsIgnoreCase("SC")) {
                algebraMethods.SC();
            }
            if (answer.equalsIgnoreCase("DOTS")) {
                algebraMethods.DOTS();
            } else {
                System.out.println("\nThe choice you entered is invalid. Pick one from below");
            }
            repeat = true;
        } while (true);
    }

    static void statisticMethods() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Avg)" + "\nAvg = Find the factor of a set of number" + ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("avg")){
                statisticMethods.average();
            }
        } while (true);
    }
}

