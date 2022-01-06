package exercises.linkedLists;
import exercises.linkedLists.ListNode;

import java.util.Iterator;
import java.util.ListIterator;

public class List<T> implements Iterable<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int currentSize;

    public List() {
        head = null;
        tail = null;
        currentSize = 0;
    }

    public int size() { return this.currentSize; }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.currentSize = 0;
    }

    public void joinAtTheEnd (T data) {
        ListNode<T> newNode = new ListNode<T>(null, data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        currentSize++;
    }

    public T popFirst() throws ArrayIndexOutOfBoundsException {
        if (head != null) {
            T data = head.getData();
            head = head.getNext();
            currentSize--;
            return data;
        } else {
            throw new ArrayIndexOutOfBoundsException(0);
        }
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == currentSize - 1) {
            return tail.getData();
        }

        ListNode<T> current = head;
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

    public void setDataAtIndex (T data, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0) { throw new ArrayIndexOutOfBoundsException(index); }
        if (index == currentSize - 1) { tail.setData(data); }

        ListNode<T> current = head;
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

    public void insertNodeAtIndex (T data, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0) { throw new ArrayIndexOutOfBoundsException(index); }

        if (index == currentSize - 1) {
            ListNode<T> newNode = new ListNode<>(null, data);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

        ListNode<T> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                ListNode<T> newNode = new ListNode<>(current.getNext(), data);
                current.setNext(newNode);
                currentSize++;
            }

            currentIndex ++;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }

    public void deleteNodeAtIndex (int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 ) { throw new ArrayIndexOutOfBoundsException(index); }

        ListNode<T> previous = null;
        ListNode<T> current = head;
        ListNode<T> next = head.getNext();
        int currentIndex = 0;

        if (index == 0) {
            this.head =head.getNext();
            currentSize--;
            return;
        }

        while (current != null) {
            if (currentIndex == index) {
                previous.setNext(next);
                currentSize--;
                return;
            }

            currentIndex++;
            previous = current;
            current = next;
            next = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }

    public boolean contains(T data) {
        if (currentSize == 0) return false;

        ListNode<T> current = head;

        while (current != null) {
            if (current.getData().equals(data)) return true;
        }

        return false;
    }

    // Implementing the iterator
    public Iterator<T> iterator () {
        return new ListIterator<T>(head);
    }

    private static class ListIterator<T> implements Iterator<T> {
        private ListNode<T> next;

        public ListIterator (ListNode<T> next) {
            this.next = next;
        }

        public boolean hasNext () {
            return next != null;
        }

        public T next() {
            ListNode<T> result = next;
            next = next.getNext();
            return result.getData();
        }

        public void remove () {
            throw new UnsupportedOperationException();
        }
    }

}
