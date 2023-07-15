import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Set<ArrayList<Integer>> set = new HashSet<>();

		for(int i=0;i<arr.length;i++){
			int l = i+1;
			int r = arr.length-1;
			while(l<r){
				if(arr[i]+arr[l]+arr[r]==K){
					ArrayList<Integer> subList = new ArrayList<>();
					subList.add(arr[i]);
					subList.add(arr[l]);
					subList.add(arr[r]);
					Collections.sort(subList);
					set.add(subList);
					l++;
					r--;
				}else if(arr[i]+arr[l]+arr[r]<K){
					l++;
				}else{
					r--;
				}
			}
		}

		list.addAll(set);
		return list;
	}
}
