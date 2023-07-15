import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int n = 0;
		for(int i=0;i<arr.size();i++){
			int currSum = arr.get(i);
			if(currSum==0){
				n = Math.max(n, 1);
			}
			for(int j=i+1;j<arr.size();j++){
				currSum = currSum+arr.get(j);
				if(currSum==0){
					n = Math.max(n, j-i+1);
				}
			}
		}
		return n;
	}
}
