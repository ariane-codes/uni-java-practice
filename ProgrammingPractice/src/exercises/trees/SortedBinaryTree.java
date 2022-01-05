package exercises.trees;

public class SortedBinaryTree<T extends Comparable<T>> {

    private SortedNode<T> root;

    public SortedBinaryTree() {
        root = null;
    }

    public boolean contains (T key) {
        return root.find(key) != null;
    }

    public void add (T key) {
        if (root == null) {
            root = new SortedNode<T>(key);
        } else {
            root.insert(key);
        }
    }

    public void showTree() {
        root.prettyPrint("");
    }

    public int size() {
        return root.countNodes();
    }

    public static void main (String[] args) {
        SortedBinaryTree<String> tree = new SortedBinaryTree<> ();

        tree.add ("Tree");
        tree.add ("Cat");
        tree.add ("Apple");
        tree.add ("Aardvark");
        tree.add ("Banana");

        System.out.println ("Tree contains apple? " + tree.contains("Apple"));
        System.out.println ("Tree contains orange? " + tree.contains ("Orange"));

        tree.showTree ();
    }
}
