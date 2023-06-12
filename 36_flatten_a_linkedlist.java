/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

import java.util.*;

class NodevaluePair {

    int value;
    Node node;

    NodevaluePair(Node node, int value) {

        this.value = value;
        this.node = node;
    }
}

class pairComp implements Comparator<NodevaluePair> {

    public int compare(NodevaluePair pairOne, NodevaluePair pairTwo) {

        return pairOne.value - pairTwo.value;
    }
}

public class Solution {

    public static Node flattenLinkedList(Node head) {

        Node pointer = head;
        Node result = null;

        PriorityQueue<NodevaluePair> pq = new PriorityQueue<NodevaluePair>(new pairComp());

        while (pointer != null) {

            pq.add(new NodevaluePair(pointer, pointer.data));
            pointer = pointer.next;
        }

        while (!pq.isEmpty()) {

            Node temp = pq.poll().node;

            if (temp.child != null) {
                pq.add(new NodevaluePair(temp.child, temp.child.data));
            }

            if (result == null) {
                result = temp;
                pointer = temp;
                pointer.next = null;
            } else {
                pointer.child = temp;
                pointer = temp;
                pointer.next = null;
            }
        }

        return result;
    }

}
