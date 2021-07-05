package node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 05-07-2021
 * Time: 09:23
 */

public class Node {
    private int data;
    private Node next;
    public Node (int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
