import java.util.*;
import java.lang.*;
import java.io.*;

public class controllerMethods {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static Boolean repeat = false;

    static void mainMethod() {
        do {
            System.out.println(
                    ANSI_PURPLE + "Do you want statics mode or algebra mode?" + "\nAlgebra = Sets of calculator for Algebra problems"
                            + "\nStat = Sets of statistic calculators" + "\nTrig = Sets of Trigonometry calculators" + "\nInfo = Information on stuff you probably can't remember" + ANSI_RESET);
            String mainChoice = sc.nextLine();
            if (mainChoice.equalsIgnoreCase("Algebra")) {
                algebraMethods();
            } else if (mainChoice.equalsIgnoreCase("Stat")) {
                statisticMethods();
            } else if (mainChoice.equalsIgnoreCase("trig")){
                trigonometryMethods();
            } else if (mainChoice.equalsIgnoreCase("Info")) {
                infoChecks();
            } else {
                System.out.println("The choices you entered is invalid. Pick Algebra or Stat or Trig or Info");
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
                    + "\nDOTS = Difference Between Two Squares"
                    + "\nMain = Return to the main menu" + ANSI_RESET);
            String answer = sc.nextLine();
            // if the input is y, set repeat program to true otherwise exit
            if (answer.equalsIgnoreCase("Factor")) {
                algebraMethods.factorFinder();
            }
            if (answer.equalsIgnoreCase("GCF")) {
                algebraMethods.GCFfinder();
            }
            if (answer.equalsIgnoreCase("SQR")) {
                algebraMethods.squareRoot();
            }
            if (answer.equalsIgnoreCase("Expo")) {
                algebraMethods.exponent();
            }
            if (answer.equalsIgnoreCase("Quad")) {
                algebraMethods.quadratic();
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
            }
            if (answer.equalsIgnoreCase("Main")) {
                mainMethod();
            }
            else {
                System.out.println("\nThe choice you entered is invalid. Pick one from below");
            }
            repeat = true;
        } while (true);
    }

    static void statisticMethods() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Avg)" + "\nAvg = Find the factor of a set of number" + "\nMSD = Calculates the mean and the standard deviation of a set of numbers" + "\nMain = Return to the main menu"+ ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("avg")){
                statisticMethods.average();
            }
            if (answer.equalsIgnoreCase("MSD")){
                statisticMethods.standardDeviation();
            }
            if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
        } while (true);
    }

    static void trigonometryMethods() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Avg)" + "\nCOS = Finds the cosine of the specified value." + "\nMain = Return to the main menu"+ ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("cos")){
                trigonometryMethods.cos();
            }
            if (answer.equalsIgnoreCase("MSD")){
                statisticMethods.standardDeviation();
            }
            if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
        } while (true);
    }

    static void infoChecks() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Avg)" + "\nPI = Shows PI" + "\nPS = Checks if a number is perfect square"+ ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("PI")){
                infoChecks.pi();
            }
            if (answer.equalsIgnoreCase("PS")){
                infoChecks.PerfectSquare();
            }
            if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
        } while (true);
    }
}
