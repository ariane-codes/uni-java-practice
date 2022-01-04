package exercises;

public class QueueInt {

    public int[] array;
    public int currentSize;
    public int maximumSize;

    public QueueInt (int maximumSize) {
        array = new int[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = 0;
    }

    public void join (int value) {
        if (currentSize >= maximumSize) {
            System.out.println("Exceeded max space");
            return;
        }

        array[currentSize++] = value;
    }

    public boolean isEmpty() {return currentSize == 0;}

    public int leave() {
        if (currentSize == 0) {
            System.out.println("Queue is empty, can't leave");
            return -1;
        }

        int firstInQueue = array[0];

        for (int i=0; i<currentSize-1; i++) {
            array[i] = array[i+1];
        }

        currentSize--;

        return firstInQueue;
    }

}
