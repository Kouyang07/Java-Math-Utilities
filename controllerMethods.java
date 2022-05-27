import java.util.*;
import java.lang.*;

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
                            + "\nStat = Sets of statistic calculators" + "\nTrig = Sets of Trigonometry calculators" + "\nMisc = Random misc stuff" + "\nList = If you want to list all of the methods that are available"+ ANSI_RESET);
            String mainChoice = sc.nextLine();
            if (mainChoice.equalsIgnoreCase("Algebra")) {
                algebraMethods();
            } else if (mainChoice.equalsIgnoreCase("Stat")) {
                statisticMethods();
            } else if (mainChoice.equalsIgnoreCase("trig")){
                trigonometryMethods();
            } else if (mainChoice.equalsIgnoreCase("Misc")) {
                misc();
            }  else if (mainChoice.equalsIgnoreCase("List")) {
                list();
            }
            else {
                System.out.println(ANSI_RED + "The choice you entered is invalid. Pick Algebra or Stat or Trig or Misc" + ANSI_RESET);
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
            else if (answer.equalsIgnoreCase("GCF")) {
                algebraMethods.GCFfinder();
            }
            else if (answer.equalsIgnoreCase("SQR")) {
                algebraMethods.squareRoot();
            }
            else if (answer.equalsIgnoreCase("Expo")) {
                algebraMethods.exponent();
            }
            else if (answer.equalsIgnoreCase("Quad")) {
                algebraMethods.quadratic();
            }
            else if (answer.equalsIgnoreCase("Fac")) {
                algebraMethods.Fac();
            }
            else if (answer.equalsIgnoreCase("CR")) {
                algebraMethods.CR();
            }
            else if (answer.equalsIgnoreCase("SC")) {
                algebraMethods.SC();
            }
            else if (answer.equalsIgnoreCase("DOTS")) {
                algebraMethods.DOTS();
            }
            else if (answer.equalsIgnoreCase("Main")) {
                mainMethod();
            }
            else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
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
            else if (answer.equalsIgnoreCase("MSD")){
                statisticMethods.standardDeviation();
            }
            else if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
            else if (answer.equalsIgnoreCase("Outliers")){
                statisticMethods.outliers();
            }
            else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
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
            else if (answer.equalsIgnoreCase("MSD")){
                statisticMethods.standardDeviation();
            }
            else if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
            else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
            }
        } while (true);
    }

    static void misc() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Avg/PI/PS/RNG)" + "\nPI = Shows PI" + "\nPS = Checks if a number is perfect square"+ "\nRNG = Random Number Generator" + "\nMain = Return to the main menu" + ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("PI")){
                misc.pi();
            }
            else if (answer.equalsIgnoreCase("PS")){
                misc.PerfectSquare();
            }
            else if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
            else if (answer.equalsIgnoreCase("RNG")) {
                misc.RNG();
            } else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
            }
        } while (true);
    }

    static void list() {
        System.out.println(ANSI_BLUE + "--CURRENT AVAILABLE TOOLS--\n" +
                "\n" +
                "Algebra - Factor = Find the factor of a number\n" +
                "\n" +
                "Algebra - GCF = Find the greatest common factor of a number\n" +
                "\n" +
                "Algebra - SQR = Find the square root of a number\n" +
                "\n" +
                "Algebra - Quad = Solve a quadratic equation\n" +
                "\n" +
                "Algebra - Expo = Evaluate the given exponent\n" +
                "\n" +
                "Algebra - Fac = Factorial of a given number\n" +
                "\n" +
                "Algebra - CR = Cube root of a given number\n" +
                "\n" +
                "Algebra - SC = Simple calculator to calculate simple 2 term equations\n" +
                "\n" +
                "Algebra - DOTS = Difference Between Two Squares\n" +
                "\n" +
                "Stat - AVG = The average of a set of numbers\n" +
                "\n" +
                "Stat - MSD = Calculates the mean and the average deviation of a set of numbers\n" +
                "\n" +
                "Trig - COS = Calculates the cosine of a given number"+
                "\n" +
                "\nMisc - PS = Check if the number is a perfect square" +
                "\n"+
                "\nMisc - PI = List the numbers of PI" +
                "\n" +
                "\nMisc - RNG = Random Number Generator" + ANSI_RESET);

    }
}
