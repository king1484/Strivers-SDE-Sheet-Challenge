import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> list = new ArrayList<>();
		ArrayList<Long> item1 = new ArrayList<>();
		item1.add((long)1);
		list.add(item1);
		if(n==1){
			return list;
		}
		ArrayList<Long> item2 = new ArrayList<>();
		item2.add((long)1);
		item2.add((long)1);
		list.add(item2);
		if(n==2){
			return list;
		}

		for(int i=2;i<n;i++){
			ArrayList<Long> item = new ArrayList<>();
			item.add((long)1);
			for(int j=1;j<i;j++){
				item.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
			}
			item.add((long)1);
			list.add(item);
		}
		return list;
	}
}
