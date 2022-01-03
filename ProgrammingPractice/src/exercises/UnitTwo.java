package exercises;

import java.util.Arrays;

public class UnitTwo {

    public static void swap (int[] numbers, int i1, int i2) {
         int temp = numbers[i1];
         numbers[i1] = numbers[i2];
         numbers[i2] = temp;
    }

    public static void bubbleSort (int[] numbers) {
        boolean madeSwap;

        do {
            madeSwap = false;
            for (int i=0; i < numbers.length-1; i = i+1) {
                if (numbers[i] > numbers[i+1]) {
                    swap(numbers, i, i+1);
                    madeSwap = true;
                }
            }
        } while (madeSwap);
    }

    public static int findSmallestNumberIndex(int[] array, int start) {
        // Return the index of the smallest number

        if (array.length == 0) {
            return -1;
        }

        int smallestIndex = start;
        int min = array[smallestIndex];

        for (int i = start; i < array.length; i++) {
//            System.out.println("SmallestIndex " + smallestIndex + " min " + min);
            if (array[i] <= min) {
                min = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void selectionSort (int[] numbers) {
        int t = 0;

        do {
            int smallest = findSmallestNumberIndex(numbers, t);
            swap(numbers, t, smallest);
            t = t+1;
        } while (t != numbers.length);
    }

    public static void doInsert(int[] numbers, int top) {
        for (int i=0; i<top; i=i+1) {
            if (numbers[i] > numbers[top]) {
                swap (numbers, i, top);
            }
        }
    }

    public static void insertionSort (int[] numbers) {
        int t = 0;

        do {
            doInsert (numbers, t);
            t = t+1;
        } while (t != numbers.length);
    }

    public static int findNumber (int[] numbers, int toFind) {
        // Return -1 if it's not found
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == toFind) return i;
        }

        return -1;
    }

    public static int binarySearch (int[] numbers, int toFind) {
        int left = 0;
        int right = numbers.length -1;

        while (left <= right) {
            int middle = (left + right)/2;

            if (toFind == numbers[middle]) {
                return middle;
            } else if (toFind < numbers[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1; // Nothing was found
    }

    public static void main (String[] args) {
        int[] sampleArray = {1, 0, 3, 5, 10, 20};

        int smallestIndex = findSmallestNumberIndex(sampleArray, 0);

        System.out.println("Smallest index returned  " + smallestIndex);

        selectionSort(sampleArray);

        System.out.println(Arrays.toString(sampleArray));
    }
}
