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
        System.out.println(ANSI_PURPLE + "Enter the number you want the find the COS of" + ANSI_RESET);
        double degrees = sc.nextInt();
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
    }
    }
