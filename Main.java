import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
        boolean valid = false;
        try {
            controllerMethods.mainMethod();
        } catch (IllegalArgumentException e) {
            controllerMethods.mainMethod();
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "Not a valid number" + ANSI_RESET);
            controllerMethods.mainMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ANSI_RED + "Trying to access an non existent element of an array(ArrayIndexOutOfBoundsException). Contact Croticalism#2711 on discord and report the problem" + ANSI_RESET);
        }
    }
}
