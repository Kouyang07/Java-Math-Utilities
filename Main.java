import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        boolean valid = false;
        try {
            controllerMethods.mainMethod();
        } catch (IllegalArgumentException e) {
            controllerMethods.mainMethod();
        }

    }
}
