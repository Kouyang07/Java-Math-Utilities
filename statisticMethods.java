import java.util.*;
import java.lang.*;

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
        boolean valid = false;
        int n = 0;
        while (!valid) {
            System.out.println("Enter the total amount of numbers you want to find the mean and SD for");
            try {
                n = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println("Not a number.");
                sc.next();
            }
        }

        double[] input = new double[n];
        double sum = 0, mean;
        System.out.println("enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextDouble();
            sum = sum + input[i];
        }
        mean = sum / n;
        System.out.println("Mean: " + mean);
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow((input[i] - mean), 2);
        }
        mean = sum / (n - 1);
        double deviation = Math.sqrt(mean);
        System.out.println("standard deviation: " + deviation);
    }

    static void outliers() {

        int total = 0;
        double min = 0;
        double max = 0;
        int medianSize = 0;
        double median = 0;
        double Q1 = 0;
        double Q3 = 0;
        double IQR = 0;

//Get the size of the array from the user
        List<Double> data = new ArrayList<Double>();
        System.out.println("Enter the total amount of numbers you have in your data set");
        total = sc.nextInt();
        System.out.println("Enter" + total + "numbers");
        for (int i = 0; i < total; i++) {
            data.add(sc.nextDouble());
        }
        Collections.sort(data);
        System.out.println(data);
//find the median of the array
        if (data.size() % 2 == 0) {
            median = ((double) data.get(data.size() / 2) + (double) data.get(data.size() / 2 - 1)) / 2;
        } else {
            median = (double) data.get(data.size() / 2);
        }

//declares array lists
        List<Double> firstHalf = new ArrayList<Double>();
        List<Double> secondHalf = new ArrayList<Double>();
        ArrayList<Double> outliers = new ArrayList<Double>();

        //splits the big array into smaller arraylists by the mean
        if (data.size() % 2 == 0) {
            int intMedian = (int) Math.floor(median);
            for (int i = 0; i < intMedian - 1; i++) {
                firstHalf.add(data.get(i));
            }
            for (int i = intMedian; i < data.size(); i++) {
                secondHalf.add(data.get(i));
            }
        } else {
            int intMedian = (int) Math.ceil(median);
            for (int i = 0; i < intMedian - 1; i++) {
                firstHalf.add(data.get(i));
            }
            for (int i = intMedian; i < data.size(); i++) {
                secondHalf.add(data.get(i));
            }
        }
        //find Q1 and Q3 by finding the median of the smaller arrays
        if (firstHalf.size() % 2 == 0) {
            Q1 = ((double) firstHalf.get(firstHalf.size() / 2) + (double) firstHalf.get(firstHalf.size() / 2 - 1)) / 2;
        } else {
            Q1 = (double) firstHalf.get(firstHalf.size() / 2);
        }
        if (secondHalf.size() % 2 == 0) {
            Q3 = ((double) secondHalf.get(secondHalf.size() / 2) + (double) secondHalf.get(secondHalf.size() / 2 - 1)) / 2;
        } else {
            Q3 = (double) secondHalf.get(secondHalf.size() / 2);
        }

//Find the upperbound and lower bound
        IQR = Q3 - Q1;
        double lowerbound = Q1 - 1.5*IQR;
        double upperbound = Q3 + 1.5*IQR;


        for(int k = 0; k<data.size(); k++){
            if (data.get(k) < lowerbound || data.get(k) > upperbound){
                outliers.add(data.get(k));
            }
        }

        System.out.println(outliers);
        System.out.println(lowerbound);
        System.out.println(upperbound);

    }
}

