package exercises.trees;

public class SortedNode<T extends Comparable<T>> {
    // A sorted binary tree
    private T key;
    private SortedNode<T> leftChild;
    private SortedNode<T> rightChild;

    public SortedNode (T key) {
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }

    public SortedNode<T> find (T searchKey) {
        // Finds a node in a sorted binary tree.
        if (key.compareTo(searchKey) == 0) {
            return this;
        }

        else if (key.compareTo(searchKey) > 0) {
            // The key is larger than searchKey
            if (leftChild == null) return null; // Return null if there's nothing on the left child
            else return leftChild.find(searchKey); // Recursive call in the left child if it exists.
        }

        else {
            // They key is smaller than searchKey
            if (rightChild == null) return null; // Nothing on the right child.
            else return rightChild.find(searchKey); // Recursive call on the right child.
        }

    }

    public boolean contains (T searchKey) {
        SortedNode<T> result = this.find(searchKey);
        return result != null;
    }

    public void insert (T insertKey) {
        if (key.equals(insertKey)) {
            return; // It's already in the tree.
        }

        if (key.compareTo(insertKey) > 0) {
            // insertKey is bigger than key
            if (leftChild == null) {
                // Insert as left child if there isn't one
                leftChild = new SortedNode<T>(insertKey);
            } else {
                // Recursive call on the left child
                leftChild.insert(insertKey);
            }
        }

        if (key.compareTo(insertKey) < 0) {
            // insertKey is smaller than key
            if (rightChild == null) {
                //  Insert as right child if there isn't one
                rightChild = new SortedNode<T>(insertKey);
            } else {
                // Recursive call on the right child.
                rightChild.insert(insertKey);
            }
        }
    }

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

    public void prettyPrint (String insert) {
        System.out.println(insert + "Node: " + key);
        if (leftChild != null) {
            leftChild.prettyPrint(insert+"L-");
        }
        if (rightChild != null) {
            rightChild.prettyPrint(insert+"R-");
        }
    }
}
