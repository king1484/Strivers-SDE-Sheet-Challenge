import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long totalWater = 0;

        long[] leftMax = new long[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        long[] rightMax = new long[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        for(int i=0;i<arr.length;i++){
            long value = Math.min(leftMax[i], rightMax[i]);
            totalWater += value-arr[i];
        }

        return totalWater;
    }
}
