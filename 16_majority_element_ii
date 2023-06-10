import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            int count = map.getOrDefault(arr.get(i), 0) + 1;
            map.put(arr.get(i), count);
        }

        for(int i=0;i<arr.size();i++){
            if(map.get(arr.get(i))>Math.floor(arr.size()/3)){
                if(!list.contains(arr.get(i))){
                    list.add(arr.get(i));
                }
            }
        }

        return list;
    }
}
