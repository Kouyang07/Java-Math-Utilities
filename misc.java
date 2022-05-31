import java.util.*;
import java.lang.*;

public class misc {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);

    static void pi() {
        System.out.println(ANSI_GREEN + "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989380952572010654858632788659361533818279682303019520353018529689957736225994138912497217752834791315155748572424541506959508295331168617278558890750983817546374649393192550604009277016711390098488240128583616035637076601047101819429555961989467678374494482553797747268471040475346462080466842590694" + ANSI_RESET);
    }

    static void PerfectSquare() {
        int num2check = 0;
        boolean valid = false;

        while (!valid) {
            System.out
                    .println(ANSI_CYAN + "\nEnter the number you want to check if square root(Numbers only)" + ANSI_RESET);
            try {
                num2check = sc.nextInt();
                valid = true;
                // catches the mismatch exception, so it will only take int input. If letter
                // return Not a number
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
                sc.next();
            }
        }
        // main check
        int sqrt = (int) Math.sqrt(num2check);
        if (sqrt * sqrt == num2check) {
            System.out.println(ANSI_GREEN + num2check + " is a perfect square number! Its square is " + sqrt + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + num2check + " is NOT a perfect square number!" + ANSI_RESET);
        }
    }

    static void RNG() {
        int highest = 0;
        int total = 0;
        boolean valid = false;
        try {
            System.out.println(ANSI_PURPLE + "Enter the amount of numbers you want to generate" + ANSI_RESET);
            total = sc.nextInt();
            valid = true;
            // catches the mismatch exception, so it will only take int input. If letter
            // return Not a number
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
            sc.next();
        }
        try {
            System.out.println(ANSI_PURPLE + "Enter the highest number(1-x)" + ANSI_RESET);
            highest = sc.nextInt();
            valid = true;
            // catches the mismatch exception, so it will only take int input. If letter
            // return Not a number
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "Not a number." + ANSI_RESET);
            sc.next();
        }


        Random num = new Random();
        int res = 0;
        for (int i = 1; i <= total; i++) {
            res = 1 + num.nextInt(highest);
            System.out.println(ANSI_GREEN + res + ANSI_RESET);
        }
    }
    static void LEM(){
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