import java.util.*;
import java.io.*;
import java.lang.*;

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
                    ANSI_PURPLE + "Do you want advanced mode or simple mode?" + "\nSimple = Able to pick specific operations"
                            + "\nAdv = calculate based on arguments(WIP AND DOESN'T WORK)" + ANSI_RESET);
            String mainChoice = sc.nextLine();
            if (mainChoice.equalsIgnoreCase("Simple")) {
                SimpleMode();
            } else if (mainChoice.equalsIgnoreCase("Adv")) {
                calculator.advancedMode();
            } else {
                System.out.println("The choices you entered is invalid. Pick simple or adv");
            }
        } while (true);
    }
    static void SimpleMode() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Factor/GCF/SQR/PS/Quad)"
                    + "\nFactor = Find the factor of a number" + "\nGCF = Find the greatest common factor of a number"
                    + "\nSQR = Find the square root of a number" + "\nPS = Check if the number is a perfect square"
                    + "\nQuad = Solve a quadratic equation" + "\nExpo = Evaluate the given exponent"
                    + "\nFac = Factorial of a given number" + "\nCR = Cube root of a given number" + "\nSC = Simple calculator to calculate simple 2 term equations" + "\nDOTS = Difference Between Two Squares" + ANSI_RESET);
            String answer = sc.nextLine();
            // if the input is y, set repeat program to true otherwise exit
            if (answer.equalsIgnoreCase("Factor")) {
                calculator.factorFinder();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("GCF")) {
                calculator.GCFfinder();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("SQR")) {
                calculator.squareRoot();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("PS")) {
                calculator.PerfectSquare();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Expo")) {
                calculator.exponent();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Quad")) {
                calculator.quadratic();
                repeat = true;
            }
            if (answer.equalsIgnoreCase("Fac")) {
                calculator.Fac();
            }
            if (answer.equalsIgnoreCase("CR")) {
                calculator.CR();
            }
            if (answer.equalsIgnoreCase("SC")) {
                calculator.SC();
            }
            if (answer.equalsIgnoreCase("DOTS")){
                calculator.DOTS();
            }
            else {
                System.out.println("\nThe choice you entered is invalid. Pick one from below");
            }
            repeat = true;
        } while (true);
    }
    }

