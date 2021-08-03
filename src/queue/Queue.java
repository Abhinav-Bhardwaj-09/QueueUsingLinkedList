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
    private Node front, rear;
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
        Node temp = new Node(data);
        if(isEmpty()) {
            front = temp;
        }
        else {
            rear.setNext(temp);
        }
        rear = temp;
        length++;
    }



    // To delete element in the queue
    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }
        int result = front.getData();
        front = front.getNext();
        if(front == null ) {
            rear = null;
        }
        length--;
        return result;
    }

}
