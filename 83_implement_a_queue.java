import java.util.* ;
import java.io.*; 
public class Queue {
    Node front;
    Node rear;

    Queue() {
       front = rear = null;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return front==null && rear==null;
    }

    void enqueue(int data) {
        Node node = new Node(data);
        if(isEmpty()){
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    int dequeue() {
        if(isEmpty()){
            return -1;
        }
        int val = front.data;
        if(front==rear){
            front = rear = null;
        }else{
            front = front.next;
        }
        return val;
    }

    int front() {
        if(isEmpty()){
            return -1;
        }
        return front.data;
    }

}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
