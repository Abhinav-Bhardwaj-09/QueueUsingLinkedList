package node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 05-07-2021
 * Time: 09:23
 */

public class Node {
    private int data;
    private Node nextNode;

    public Node (int data) {
        this.data = data;
        this.nextNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
