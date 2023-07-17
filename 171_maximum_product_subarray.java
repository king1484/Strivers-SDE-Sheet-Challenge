import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		if(n==1){
			return arr.get(0);
		}
		int maxProduct = 0;
		for(int i=0;i<n;i++){
			int product = 1;
			for(int j=i;j<n;j++){
				product *= arr.get(j);
				maxProduct = Math.max(product, maxProduct);
			}
		}
		return maxProduct;
	}
}
