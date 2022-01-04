package exercises.linkedLists;

public class ListNode {
    private ListNode next;
    private String data;

    public ListNode (ListNode next, String data) {
        this.next = next;
        this.data = data;
    }

    public ListNode getNext() { return this.next; }
    public String getData() { return this.data; }

    public void setNext(ListNode listNode) { this.next = listNode; }
    public void setData(String data) { this.data = data; }

    public void joinAtTheEnd (String data) {
        ListNode current = this;

        // Walk the list until we find the last item.
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext( new ListNode (null, data ));
    }

    public String get (int index) throws ArrayIndexOutOfBoundsException {
        ListNode current = this;
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

    public void setDataAtIndex (int index, String data) throws ArrayIndexOutOfBoundsException {
        ListNode current = this;
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

    public ListNode insertNodeAtIndex (int index, String data) throws ArrayIndexOutOfBoundsException {
        ListNode current = this;
        int currentIndex = 0;

        if (index < 0) {
            // Check index is positive
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            return new ListNode(current, data);
        }

        while (current != null) {
            if (currentIndex == index) {
                ListNode nextNode = current.getNext();
                current.setNext(new ListNode(nextNode, data));
                return this;
            }

            currentIndex ++;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }

    public ListNode popNodeAtIndex (int index) throws ArrayIndexOutOfBoundsException {
        ListNode previous = null;
        ListNode current = this;
        ListNode next = this.getNext();
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
