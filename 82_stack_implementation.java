import java.util.* ;
import java.io.*; 

public class Stack {
    ArrayList<Integer> list = new ArrayList<>();
    int size;
    public Stack(int n){
        size = n;
    }
    void push(int num) {
        if(isFull()==0){
            list.add(num);
        }
    }
    int pop() {
        if(isEmpty()==1){
            return -1;
        }
        return list.remove(list.size()-1);
    }
    int top() {
        if(isEmpty()==1){
            return -1;
        }
        return list.get(list.size()-1);
    }
    int isEmpty() {
        return list.isEmpty()?1:0;
    }
    int isFull() {
        return list.size()==size?1:0;
    }
}
