package tests;
import exercises.UnitOne;
import tests.AssertResults;
import exercises.UnitTwo;

public class UnitTwoTest {

    public static void main (String[] args) {
        boolean passedTests = true;

        int[] emptyArray = {};
        int[] oneLength = {1};
        int[] dupesArray = {1, 2, 3, 2, 1, 3};
        int[] sampleArray = {1, 0, 3, 5, 10, 20};

        UnitTwo.bubbleSort(emptyArray);
        UnitTwo.bubbleSort(oneLength);
        UnitTwo.bubbleSort(dupesArray);
        UnitTwo.bubbleSort(sampleArray);

        sampleArray = new int[]{1, 0, 3, 5, 10, 20};

        passedTests = AssertResults.testEqualIntArrays(emptyArray, new int[]{});
        passedTests = AssertResults.testEqualIntArrays(oneLength, new int[]{1});
        passedTests = AssertResults.testEqualIntArrays(dupesArray, new int[]{1, 1, 2, 2, 3, 3});
        passedTests = AssertResults.testEqualIntArrays(sampleArray, new int[]{0, 1, 3, 5, 10, 20});
        passedTests = AssertResults.testEqualInts(UnitTwo.findSmallestNumberIndex(sampleArray, 0), 1);

        if (passedTests) {
            System.out.println("All tests ran successfully.");
        } else {
            System.out.println("There was an error in the tests.");
        }

    }
}
