package exercises.linkedLists;
import exercises.linkedLists.ListNode;


public class ListString {
    private ListNode<String> head;
    private ListNode<String> tail;
    private int currentSize;

    public ListString() {
        head = null;
        tail = null;
        currentSize = 0;
    }

    public int size() {
        return this.currentSize;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.currentSize = 0;
    }

    public void joinAtTheEnd (String data) {
        if (head == null) {
            head = tail = new ListNode<String> (null, data);
        } else {
            ListNode<String> newNode = new ListNode<String>(null, data);
            tail.setNext(newNode);
            tail = newNode;
        }
        currentSize ++;
    }

    public String popFirst () {
        if (head != null) {
            String data = head.getData();
            head = head.getNext();
            currentSize--;
            return data;
        }

        return "";
    }

    public String get (int index) throws ArrayIndexOutOfBoundsException {

        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == currentSize - 1) {
            return tail.getData();
        }

        ListNode<String> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.getData();
            }

            currentIndex++;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);


    }

    public void setDataAtIndex (String data, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == currentSize - 1) {
            tail.setData(data);
        }

        ListNode<String> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                current.setData(data);
            }

            currentIndex++;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }

    public void insertNodeAtIndex (String data, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == currentSize - 1) {
            ListNode<String> newNode = new ListNode(null, data);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

        ListNode<String> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                ListNode<String> newNode = new ListNode<String>(current.getNext(), data);
                current.setNext(newNode);
                currentSize ++;
            }

            currentIndex ++;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }

    public void deleteNodeAtIndex (int index) throws ArrayIndexOutOfBoundsException {

        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        ListNode<String> previous = null;
        ListNode<String> current = head;
        ListNode<String> next = head.getNext();
        int currentIndex = 0;

        if (index == 0) {
            this.head = head.getNext();
            currentSize --;
            return;
        }

        while (current != null) {
            if (currentIndex == index) {
                previous.setNext(next);
                currentSize --;
                return;
            }

            currentIndex++;
            previous = current;
            current = next;
            next = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }
}
