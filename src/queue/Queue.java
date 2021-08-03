package queue;

import node.Node;

import java.util.NoSuchElementException;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 05-07-2021
 * Time: 09:24
 */

public class Queue {
    private Node frontNode, rearNode;
    private int length;

    // To return length of the Queue
    public int length() {
        return length;
    }



    // To check whether queue is empty or not
    public boolean isEmpty() {
        return length == 0;
    }



    // To add new element in the queue
    public void enqueue (int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            frontNode = newNode;
        }
        else {
            rearNode.setNextNode(newNode);
        }
        rearNode = newNode;
        length++;
    }



    // To delete element in the queue
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Your queue is already empty.");
            return;
        }

        int result = frontNode.getData();
        frontNode = frontNode.getNextNode();
        if(frontNode == null ) {
            rearNode = null;
        }
        length--;
    }
}
