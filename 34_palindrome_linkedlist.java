import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head==null || head.next==null){
			return true;
		}
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}

		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> curr = slow;
		LinkedListNode<Integer> next;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		LinkedListNode<Integer> leftHead = head;
		LinkedListNode<Integer> rightHead = prev;
		while(leftHead!=null && rightHead!=null){
			if(!leftHead.data.equals(rightHead.data)){
				return false;
			}
			leftHead = leftHead.next;
			rightHead = rightHead.next;
    }
		return true;
	}
}
