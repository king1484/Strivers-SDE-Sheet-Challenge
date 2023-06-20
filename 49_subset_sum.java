import java.util.* ;
import java.io.*; 
public class Solution {

    public static void sum(int index, int[] arr, ArrayList<Integer> list, int sum){
        if(index == arr.length){
            list.add(sum);
            return;
        }
        sum(index+1, arr, list, sum+arr[index]);
        sum(index+1, arr, list, sum);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> list = new ArrayList<>();
        sum(0, num, list, 0);
        Collections.sort(list);
        return list;
    }

}
