package exercises.linkedLists;

public class ListNode<T> {
    private ListNode<T> next;
    private T data;

    public ListNode (ListNode<T> next, T data) {
        this.next = next;
        this.data = (T) data;
    }


    public ListNode<T> getNext() { return this.next; }
    public T getData() { return this.data; }

    public void setNext(ListNode<T> listNode) { this.next = listNode; }
    public void setData(T data) { this.data = data; }

    public void joinAtTheEnd (T data) {
        ListNode<T> current = this;

        // Walk the list until we find the last item.
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext( new ListNode<T> (null, data ));
    }

    public T get (int index) throws ArrayIndexOutOfBoundsException {
        ListNode<T> current = this;
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

    public void setDataAtIndex (int index, T data) throws ArrayIndexOutOfBoundsException {
        ListNode<T> current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                current.setData(data);
                return;
            }

            currentIndex ++;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }

    public ListNode<T> insertNodeAtIndex (int index, T data) throws ArrayIndexOutOfBoundsException {
        ListNode<T> current = this;
        int currentIndex = 0;

        if (index < 0) {
            // Check index is positive
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            return new ListNode<T>(current, data);
        }

        while (current != null) {
            if (currentIndex == index) {
                ListNode<T> nextNode = current.getNext();
                current.setNext(new ListNode<T>(nextNode, data));
                return this;
            }

            currentIndex ++;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }

    public ListNode<T> popNodeAtIndex (int index) throws ArrayIndexOutOfBoundsException {
        ListNode<T> previous = null;
        ListNode<T> current = this;
        ListNode<T> next = this.getNext();
        int currentIndex = 0;

        if (index < 0) {
            // Check index is positive
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            return next;
        }

        while (current != null) {
            if (currentIndex == index) {
                previous.setNext(next);
                return this;
            }
            currentIndex++;
            previous = current;
            current = next;
            next = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }


}
