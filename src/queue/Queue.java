package queue;

import node.Node;


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
        else if(length == 1) {
            frontNode = null;
            rearNode = null;
            length--;
            return;
        }

        frontNode = frontNode.getNextNode();
        length--;
    }



    // To display the elements of the queue
    public void display() {
        if(isEmpty()) {
            System.out.println("Your queue is empty, so no element to display.");
            return;
        }
        else if(length == 1) {
            System.out.print("(Start) " + frontNode.getData() + " (End)");
            return;
        }

        Node currentNode = frontNode;
        System.out.print("(Start) ");
        while (currentNode.getNextNode() != rearNode) {
            if(currentNode != frontNode) {
                System.out.print("--> ");
            }
            System.out.print(currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
        System.out.print(currentNode.getData() + " (End)");
    }
}
