import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int size = n;
		for(int i=1;i<n;i++){
			if(arr.get(i-1).equals(arr.get(i))){
				size--;
			}
		}
		return size;
	}
}
