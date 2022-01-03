package exercises;

public class ArrayInt {

    private int[] array;
    private int currentSize;
    private int maximumSize;

    public ArrayInt (int maximumSize, int currentSize) {
        array = new int[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = currentSize;
    }

    public String toString () {
        String result = "";
        result = result + "[";

        for (int i=0; i<currentSize; i++) {

            result = result + array[i];

            if (i+1 < currentSize) {
                result = result + ", ";
            }
        }

        result = result + "]";

        return result;
    }

    public void set (int value, int index) {
        if (index < 0 || index >= currentSize) {
            System.out.println("Error in set: Index is out of bounds.");
            return;
        }
        array[index] = value;
    }

    public int get (int index) {
        if (index < 0 || index >= currentSize) {
            System.out.println("Index is out of bounds");
            return -1;
        }

        return array[index];
    }

    public void insert (int value, int index) {
        for (int i=currentSize-1; i>=index; i=i-1) {
            array[i+1] = array[i];
        }

        array[index] = value;
        currentSize = currentSize + 1;
    }

    public void delete (int index) {
        if (index < 0 || index >= currentSize) {
            System.out.println("Index out of bounds");
            return;
        }

        for (int i = index; i<currentSize-1; i=i+1) {
            array[i] = array[i+1];
        }
        currentSize = currentSize - 1;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public static void main (String[] args) {
        ArrayInt arr1 = new ArrayInt (10, 10);
        System.out.println ("Array 1: " + arr1);
        ArrayInt arr2 = new ArrayInt (10, 5);
        System.out.println ("Array 2: " + arr2);
        ArrayInt arr3 = new ArrayInt (10, 0);
        System.out.println ("Array 3: " + arr3);
    }
}
