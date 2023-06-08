import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0;i<n;i++){
			int count = map.getOrDefault(arr[i], 0) + 1;
			map.put(arr[i], count);
		}

		for(int i=0;i<n;i++){
			if(map.get(arr[i])>Math.floor(n/2)){
				return arr[i];
			}
		}
		return -1;
	}
}
