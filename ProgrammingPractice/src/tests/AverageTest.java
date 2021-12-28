package tests;
import exercises.Average;

public class AverageTest {

    public static void testEqualDoubles (double result, double expected) {
    double tolerance = 0.0001; // we hard-code this constant into the function
    if ((result - expected < tolerance) &&
    (expected - result < tolerance)) {
        // do nothing
    } else {
        System.out.println ("Error: the result " + result +
        " does not equal the expected " + expected);
    }
    }


    public static void main (String[] args) {
        double[] numberList = {15, 32, 67, 44, 98};
        double[] emptyList = {};
        double[] singleList = {1};

        testEqualDoubles (Average.computeAverage (numberList), 51.2);
        testEqualDoubles (Average.computeAverage (emptyList), 0);
        testEqualDoubles (Average.computeAverage (singleList), 1);
    }
}
