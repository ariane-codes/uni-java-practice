package tests;

import java.util.Arrays;
import exercises.UnitOne;

public class UnitOneTest {

    public static void testEqualIntArrays(int[] result, int[] expected) {

        int index = 0;
        for (int item : result) {
            if (item != expected[index++]) {
                System.out.println("Error: The result array " + Arrays.toString(result) +
                        " doesn't equal the expected array " + Arrays.toString(expected));
                break;
            }
        }
    }

    public static void main (String[] args) {
        String[] stringList = {
                "Hi there",
                "this is a sample",
                "list."
        };

        testEqualIntArrays(UnitOne.lengthOfStrings(stringList), new int[]{8, 16, 5});

    }
}
