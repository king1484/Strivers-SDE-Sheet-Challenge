/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        Node temp = head;
        int len = 1;
        while(temp.next!=null){
            len++;
            temp = temp.next;
        }
        k = k % len;
        k = len - k;
        temp.next = head;
        while(k > 0){
            k--;
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
