package exercises;

public class Average {

    public static double findSum (double[] numbers) {
        double sum = 0;

        // for (int i = 0; i < numbers.length; i = i + 1) {
        for (double number : numbers) {
            sum = sum + number;
        }

        return sum;
    }

    public static double computeAverage (double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        } else {
            double sum = findSum(numbers);
            return sum / numbers.length;
        }
    }

    public static void showArray (double[] numbers) {
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("\n");
    }

    public static double[] doubleArray (double[] numbers) {
        double[] newDoubledArray = new double[numbers.length];
        for (int i = 0; i < numbers.length; i = i + 1) {
            newDoubledArray[i] = numbers[i] * 2;
        }
        return newDoubledArray;
    }

    public static void main (String[] args) {
        double[] numbers = {15, 32, 67, 44, 98};
        double average = computeAverage(numbers);

        showArray(numbers);
        System.out.println("The average of the number is: " + average);

        double[] doubledArray = doubleArray(numbers);
        showArray(doubledArray);
        showArray(numbers);
    }
}