import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution 
{
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        TreeNode<Integer> curr = root;
		TreeNode<Integer> prev = null;
		while(curr != null){
			if(curr.left != null){
				prev = curr.left;
				while(prev.right != null){
					prev = prev.right;
				}
				prev.right = curr.right;
				curr.right = curr.left;
			}
			curr = curr.right;
		}
		return root;
    }
}
