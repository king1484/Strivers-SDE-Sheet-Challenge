import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr)     
    {       
        int count =0;        
        for(int i=0;i<arr.size();i++){            
            for(int j=i+1;j<arr.size();j++)
            {                
                if(arr.get(i)>2*arr.get(j)) count++;           
            }        
        }        
    return count;
    }
}
