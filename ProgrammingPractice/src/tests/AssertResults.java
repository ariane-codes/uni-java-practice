package tests;

import java.util.Arrays;

public class AssertResults {

    public static boolean testEqualIntArrays(int[] result, int[] expected) {
        boolean passed = true;

        if (result.length != expected.length) {
            System.out.println("Error: The result array " + Arrays.toString(result) +
                        " doesn't equal the expected array " + Arrays.toString(expected));
            return false;
        }

        int index = 0;
        for (int item : result) {
            if (item != expected[index++]) {
                System.out.println("Error: The result array " + Arrays.toString(result) +
                        " doesn't equal the expected array " + Arrays.toString(expected));
                passed = false;
                break;
            }
        }

        return passed;
    }

    public static boolean testEqualDoubles (double result, double expected) {
        boolean passed = true;
        double tolerance = 0.0001; // we hard-code this constant into the function
        if ((!(result - expected < tolerance)) ||
                (!(expected - result < tolerance))) {
                    System.out.println ("Error: the result " + result +
                    " does not equal the expected " + expected);
                    passed = false;
                }
        return passed;
    }

    public static boolean testEqualBoolean(boolean result, boolean expected) {
        boolean passed = true;
        if (result != expected) {
            System.out.println ("Error: the result " + result +
            " does not equal the expected " + expected);
            passed = false;
        }

        return passed;
    }

    public static boolean testEqualInts(int result, int expected) {
        boolean passed = true;
        if (result != expected) {
            System.out.println ("Error: the result " + result +
            " does not equal the expected " + expected);
            passed = false;
        }

        return passed;
    }

}
