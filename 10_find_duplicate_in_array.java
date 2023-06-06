import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<arr.size();i++){
            if(map.contains(arr.get(i))){
                return arr.get(i);
            }else{
                map.add(arr.get(i));
            }
        }
        return -1;
    }
}
