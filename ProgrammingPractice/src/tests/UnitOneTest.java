package tests;

import java.util.Arrays;
import exercises.UnitOne;
import tests.AssertResults;

public class UnitOneTest {

    public static void main (String[] args) {

        boolean passedTests = true;

        String[] stringList = {
                "Hi there",
                "this is a sample",
                "list."
        };

        passedTests = AssertResults.testEqualIntArrays(UnitOne.lengthOfStrings(stringList), new int[]{8, 16, 5});
        passedTests = AssertResults.testEqualBoolean(UnitOne.isIntArraySorted(new int[]{1, 2, 3}), true);
        passedTests = AssertResults.testEqualIntArrays(UnitOne.swapInArray(new int[]{0, 1, 2, 3}, 0, 2), new int[]{2, 1, 0, 3});
        passedTests = AssertResults.testEqualIntArrays(UnitOne.bubbleSort(new int[]{2, 3, 4, 1}), new int[]{1, 2, 3, 4});

        if (passedTests) {
            System.out.println("All tests ran successfully.");
        } else {
            System.out.println("There was an error in the tests.");
        }

    }
}
