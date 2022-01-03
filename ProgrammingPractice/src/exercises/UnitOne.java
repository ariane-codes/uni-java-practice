package exercises;

import java.util.Arrays;

public class UnitOne {

    public static int[] lengthOfStrings (String[] arrayOfStrings) {
        int[] arrayOfLengths = new int[arrayOfStrings.length];

        int index = 0;
        for (String s : arrayOfStrings) {
            arrayOfLengths[index++] = s.length();
        }

        return arrayOfLengths;
    }

    public static boolean isIntArraySorted(int[] arrayOfInts) {

        boolean isSorted = true;

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < arrayOfInts[i-1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }

    public static int[] swapInArray(int[] arrayOfInts, int indexA, int indexB) {
        // Takes the two indeces and swaps their contents in the array.
        // returns the array.

        int temp = arrayOfInts[indexA];
        arrayOfInts[indexA] = arrayOfInts[indexB];
        arrayOfInts[indexB] = temp;

        return arrayOfInts;
    }

    public static int[] bubbleSort(int[] arrayOfInts) {

        while (!isIntArraySorted(arrayOfInts)) {

            for (int i = 1; i < arrayOfInts.length; i++) {
                if (arrayOfInts[i] < arrayOfInts[i-1]) {
                    arrayOfInts = swapInArray(arrayOfInts, i, i-1);
                }
            }
        }

        return arrayOfInts;
    }

    public static void main (String[] args) {
        int[] testArray = {0, 1, 2, 3};

        int[] testArray2 = swapInArray(testArray, 0, 3);

        System.out.print(Arrays.toString(testArray2));

        int[] sorted = bubbleSort(testArray2);
        System.out.print(Arrays.toString(sorted));

    }
}
