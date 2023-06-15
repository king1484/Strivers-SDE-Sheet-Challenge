import java.util.* ;
import java.io.*; 

/*************************************************************
 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*************************************************************/


public class Solution {

	static BinaryTreeNode<Integer> prev = null;
	static BinaryTreeNode<Integer> head = null;

	public static void inOrder(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		if(head==null){
			head = root;
		}else{
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		inOrder(root.right);
	}
	
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		prev = null;
		head = null;
		inOrder(root);
		return head;
	}
	

}
