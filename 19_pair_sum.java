import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr); // Sort input arr required as per valid solution
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    int[] item = new int[2];
                    item[0] = arr[i];
                    item[1] = arr[j];
                    Arrays.sort(item); // Sort item arr required as per valid solution
                    list.add(item);
                }
            }
        }
        return list;
    }
}
