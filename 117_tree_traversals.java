import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {

	public static void inOrder(BinaryTreeNode<Integer> root, List<Integer> list){
        if(root==null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

	public static void preOrder(BinaryTreeNode<Integer> root, List<Integer> list){
        if(root==null){
            return;
        }
		list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

	public static void postOrder(BinaryTreeNode<Integer> root, List<Integer> list){
        if(root==null){
            return;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.data);
    }
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        List<List<Integer>> list = new ArrayList<>();
		List<Integer> item = new ArrayList<>();
		inOrder(root, item);
		list.add(item);
		item = new ArrayList<>();
		preOrder(root, item);
		list.add(item);
		item = new ArrayList<>();
		postOrder(root, item);
		list.add(item);
		return list;
    }
}
