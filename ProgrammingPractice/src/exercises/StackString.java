package exercises;

public class StackString {

    public String[] array;
    public int currentSize;
    public int maximumSize;

    public StackString (int maximumSize) {
        array = new String[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = 0;
    }

    public void push (String value) {
        if (currentSize >= maximumSize) {
            System.out.println("Exceeded max space");
            return;
        }

        array[currentSize] = value;
        currentSize = currentSize + 1;
    }

    public boolean isEmpty () {
        return currentSize == 0;
    }

    public String pop() {
        if (currentSize == 0) {
            System.out.println("Stack is empty, can't pop.");
            return "";
        }

        currentSize = currentSize - 1;
        return array[currentSize];
    }

    public static void main (String[] args) {
        String word = "letters";
        String[] letters = word.split("");

        StackString stack = new StackString(100);

        for (String letter : letters) stack.push(letter);

        while (!stack.isEmpty()) System.out.println(stack.pop());

        System.out.println("");
    }
}
