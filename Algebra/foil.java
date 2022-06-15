package Algebra;

import java.util.*;

public class foil {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static Scanner sc = new Scanner(System.in);

    public static void foil() {
        int product = 0;
        int sum = 0;
        int l = 0;
        int g = 0;
        ArrayList<Integer> factors = new ArrayList<Integer>();

        System.out.println(ANSI_CYAN + "Enter B of the quadratic equation without the x" + ANSI_RESET);
        sum = sc.nextInt();

        System.out.println(ANSI_CYAN + "Enter the constant C" + ANSI_RESET);

        product = sc.nextInt();

        if(product < 0){
            for(int i = product; i <= Math.abs(product); ++i) {

                // skips the iteration for i = 0
                if(i == 0) {
                    continue;
                }
                else {
                    if (product % i == 0) {
                        factors.add(i);
                    }
                }
            }
        }
        else{
            for (int i = 1; i <= product; ++i) {

                // if number is divided by i
                // i is the factor
                if (product % i == 0) {
                    factors.add(i);
                }
            }
        }

        for(int i = 0; i < factors.size(); i++){
            for(int k = 0; k < factors.size(); k++){
                l = factors.get(i);
                g = factors.get(k);
                if(l+g==sum){
                    System.out.println(ANSI_GREEN + "(x + " + l + ")" + "( x + " + g + ")" + ANSI_RESET);
                }
            }
        }
        System.out.println(ANSI_RED + "If there are no output then it means the quadratic expression cannot be factored by reverse FOIL" + ANSI_RESET);
    }
}
