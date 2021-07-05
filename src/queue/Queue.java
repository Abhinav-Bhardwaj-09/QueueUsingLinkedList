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

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

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
