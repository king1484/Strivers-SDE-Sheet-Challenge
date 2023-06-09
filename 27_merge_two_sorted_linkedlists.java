import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		LinkedListNode<Integer> dummyHead = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> curr = dummyHead;
        while(first!=null && second!=null){
            if(first.data < second.data){
                curr.next = first;
                first = first.next;
            }else{
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }
        while(first!=null){
            curr.next = first;
            first = first.next;
            curr = curr.next;
        }
        while(second!=null){
            curr.next = second;
            second = second.next;
            curr = curr.next;
        }
        return dummyHead.next;
	}
}
