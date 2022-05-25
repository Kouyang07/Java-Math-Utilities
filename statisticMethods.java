import java.util.*;
import java.lang.*;
import java.io.*;

public class statisticMethods {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);

    static void average() {
        int n = 0;
        double res = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println(ANSI_PURPLE + "Enter the total amount of numbers you want to find the average of");
            try {
                n = sc.nextInt();
                valid = true;
                int a[] = new int[n];
                System.out.println("Enter   " + n + "  numbers" + ANSI_RESET);
                for (int i = 0; i < n; i++)
                    a[i] = sc.nextInt();
                for (int i = 0; i < n; i++)
                    res = res + a[i];
                // catches the mismatch exception so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sc.next();
            }

            System.out.println(ANSI_GREEN + "average = " + res / n + ANSI_RESET);
        }

    }

    static void standardDeviation() {
        System.out.println("Enter the total amount of numbers you want to find the mean and SD for");
        int n=sc.nextInt();
        double[] input=new double[n];
        double sum=0,mean;
        System.out.println("enter " + n + " numbers");
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextDouble();
            sum=sum+input[i];
        }
        mean=sum/n;
        System.out.println("Mean :"+mean);
        sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.pow((input[i]-mean),2);
        }
        mean=sum/(n-1);
        double deviation=Math.sqrt(mean);
        System.out.println("standard deviation :"+deviation);
    }

}