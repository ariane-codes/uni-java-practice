package exercises.graphs;
import exercises.linkedLists.List;
import exercises.graphs.GNode;

public class Graph<T> {
    List<GNode<T>> nodes;

    public Graph() {
        nodes = new List<GNode<T>>();
    }

    public GNode<T> addNode (T value) {
        GNode<T> newNode = new GNode<>(value);
        nodes.joinAtTheEnd(newNode);
        return newNode;
    }

    public void addUndirectedLink (GNode<T> from, GNode<T> to) {
        from.addLink(to);
        to.addLink(from);
    }

    public int size() {
        if (nodes.size() > 0) {
            return nodes.get(0).countNodes(new List<GNode<T>>());
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
          Graph<Integer> graph = new Graph<> ();

          GNode<Integer> node1 = graph.addNode (1);
          GNode<Integer> node2 = graph.addNode (2);
          GNode<Integer> node3 = graph.addNode (3);
          GNode<Integer> node4 = graph.addNode (4);

          graph.addUndirectedLink (node1, node2);
          graph.addUndirectedLink (node1, node4);
          graph.addUndirectedLink (node2, node4);
          graph.addUndirectedLink (node2, node3);
          graph.addUndirectedLink (node3, node4);
    }
}
