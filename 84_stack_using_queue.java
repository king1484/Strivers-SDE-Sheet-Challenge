import java.util.* ;
import java.io.*; 
public class Stack {
    Queue<Integer> q1;
    Queue<Integer> q2;


    public Stack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public int getSize() { 
        return q1.size();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void push(int element) {
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(element);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }

    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.remove();
    }

    public int top() {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}
