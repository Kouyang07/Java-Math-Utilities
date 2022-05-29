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


    static void generalStat() {

        int total;
        double median;
        double Q1;
        double Q3;
        double IQR;
        double mean;
        double sum = 0;
        double standardDeviation = 0.0;

//Get the size of the array from the user
        List<Double> data = new ArrayList<>();
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
            median = (data.get(data.size() / 2) + (double) data.get(data.size() / 2 - 1)) / 2;
        } else {
            median = data.get(data.size() / 2);
        }

//declares array lists
        List<Double> output = new ArrayList<Double>();
        List<Double> firstHalf = new ArrayList<Double>();
        List<Double> secondHalf = new ArrayList<Double>();
        if (data.size() % 2 == 0) {
            firstHalf = data.subList(0, data.size() / 2);
            secondHalf = data.subList(data.size() / 2, data.size());
        } else {
            firstHalf = data.subList(0, data.size() / 2);
            secondHalf = data.subList(data.size() / 2 + 1, data.size());
        }

        //find Q1 and Q3 by finding the median of the smaller arrays
        if (firstHalf.size() % 2 == 0) {
            Q1 = (firstHalf.get(firstHalf.size() / 2) + firstHalf.get(firstHalf.size() / 2 - 1)) / 2;
        } else {
            Q1 = firstHalf.get(firstHalf.size() / 2);
        }
        if (secondHalf.size() % 2 == 0) {
            Q3 = (secondHalf.get(secondHalf.size() / 2) + secondHalf.get(secondHalf.size() / 2 - 1)) / 2;
        } else {
            Q3 = secondHalf.get(secondHalf.size() / 2);
        }

//Find the upperbound and lower bound
        IQR = Q3 - Q1;
        double iqr = Q3 - Q1;
        double lowerFence = Q1 - 1.5 * iqr;
        double upperFence = Q3 + 1.5 * iqr;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < lowerFence || data.get(i) > upperFence)
                output.add(data.get(i));
        }

        sum = 0.0;
        int length = data.size();

        for(double num : data) {
            sum += num;
        }

        mean = sum/length;

        for(double num: data) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        double range = data.get(data.size() - 1) - data.get(0);

        System.out.println(ANSI_GREEN + "Stdev is " + Math.sqrt(standardDeviation/length) + "\nMean: " + mean +
                "\nMedian is " + median + "\nQ1 is " + Q1 + "\nQ3 is " + Q3 + "\nIQR is " + IQR + "\nLower fence is " + lowerFence +
                "\nUpper fence is " + upperFence + "\nRange is " + range);
        if(output.size() < 1){
        System.out.println(ANSI_RED + "There are no outliers" + ANSI_RESET);
    }else{
        System.out.println(ANSI_GREEN + "The outliers are " + output + ANSI_RESET);
        }
    }
}

