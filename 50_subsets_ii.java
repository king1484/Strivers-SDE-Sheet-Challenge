import java.util.* ;
import java.io.*; 
public class Solution {

    public static void find(int index, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> item, int[] arr){
        list.add(new ArrayList<>(item));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            item.add(arr[i]);
            find(i+1, list, item, arr);
            item.remove(item.size() - 1);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        find(0, list, new ArrayList<>(), arr);
        return list;
    }

}
