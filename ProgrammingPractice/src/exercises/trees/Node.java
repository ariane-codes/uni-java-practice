package exercises.trees;

public class Node<T> {

    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node (T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    // Getters or accessors
    public T getData() { return data; }
    public Node<T> getLeftChild() { return leftChild; }
    public Node<T> getRightChild() { return rightChild; }

    // Setters or mutators
    public void setLeftChild (Node<T> node) { leftChild = node; }
    public void setRightChild (Node<T> node) { rightChild = node; }

    // To string method for the data
    public String toString() { return "Data: " + data.toString(); }

    // Count nodes
    public int countNodes() {
        int sum = 0;

        sum += 1; // For current node.

        if (leftChild != null) {
            sum += leftChild.countNodes();
        }

        if (rightChild != null) {
            sum += rightChild.countNodes();
        }

        return sum;
    }

    // Check if two trees are equals
    public boolean equals (Object o) {
        if (o == null) { return false; }
        if (!(o instanceof Node)) { return false; }

        Node node = (Node)o;

        // If the data for this node is different, they aren't the same
        if (!data.equals(node.getData())) { return false; }

        // This node has a left child, and the one to compare doesn't.
        if ( leftChild == null && node.getLeftChild() != null) { return false; }

        // They both have a left child, but they aren't the same.
        if ( leftChild != null && !leftChild.equals(node.getLeftChild())) { return false; }

        // Now, the same for the right child.
        if ( rightChild == null && node.getRightChild() != null) { return false; }
        if ( rightChild != null && !rightChild.equals(node.getRightChild())) { return false; }

        return true;
    }
}

