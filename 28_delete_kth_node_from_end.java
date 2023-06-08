/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        int size = 0;
        Node currNode = head;
        while(currNode!=null){
            size++;
            currNode = currNode.next;
        }
        if(size==K){
            return head.next;
        }
        currNode = head;
        int i = 0;
        while(currNode!=null && i+1!=size-K){
            i++;
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;

        return head;
    }
}
