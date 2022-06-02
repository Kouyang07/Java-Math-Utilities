package Misc;

import java.util.Scanner;

public class LEM {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static void LEM(){
        // Initializing the variables
        char[] variable
                = { 'a', 'b', 'c', 'x', 'y', 'z', 'w' };
        System.out.println("Enter the amount of variables");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(
                "Enter the coefficients variable");
        System.out.println(
                "Enter in the format shown below");
        System.out.println("ax + by + cz + ... = d");

        // Input of coefficients from user
        int[][] matrix = new int[num][num];
        int[][] constt = new int[num][1];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
            constt[i][0] = sc.nextInt();
        }
        // Representation of linear equations in form of
        // matrix
        System.out.println(
                "The matrix representation of the equations you entered it: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.print("  " + variable[i]);
            System.out.print("  =  " + constt[i][0]);
            System.out.println();
        }
    }
}
