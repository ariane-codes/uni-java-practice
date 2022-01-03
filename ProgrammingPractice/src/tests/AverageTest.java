package tests;
import exercises.Average;
import tests.AssertResults;

public class AverageTest {


    public static void main (String[] args) {
        double[] numberList = {15, 32, 67, 44, 98};
        double[] emptyList = {};
        double[] singleList = {1};

        AssertResults.testEqualDoubles(Average.computeAverage (numberList), 51.2);
        AssertResults.testEqualDoubles(Average.computeAverage (emptyList), 0);
        AssertResults.testEqualDoubles(Average.computeAverage (singleList), 1);
        AssertResults.testEqualDoubles(Average.findSum(numberList), 256);
        AssertResults.testEqualDoubles(Average.findSum(emptyList), 0);
        AssertResults.testEqualDoubles(Average.findSum(singleList), 1);
    }
}
