package exercises.graphs;
import exercises.linkedLists.List;

public class GNode <T>{

    private T value;
    private List<GNode<T>> links;

    public GNode(T value) {
        this.value = value;
        links = new List<GNode<T>>();
    }

    public void addLink (GNode<T> to) {
        links.joinAtTheEnd(to);
    }

    public int countNodes (List<GNode<T>> visited) {
        int sum = 0;

        if (!visited.contains(this)){
            visited.joinAtTheEnd(this);
            sum++;
        }

        for (int i=0; i<links.size(); i+=1) {
            GNode<T> child = links.get(i);
            if (!visited.contains(child)) {
                // Recursive call
                sum += child.countNodes(visited);
            }
        }

        return sum;
    }
}
