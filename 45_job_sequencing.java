import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        int maxProfit = 0;
        int maxDeadline = 0;
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[1]));

        for(int i=jobs.length-1;i>=0;i--){
            if(jobs[i][0] > maxDeadline){
                maxDeadline = jobs[i][0];
            }
        }

        int[] result = new int[maxDeadline+1];

        for(int i=0;i<result.length;i++){
            result[i] = -1;
        }

        for(int i=jobs.length-1;i>=0;i--){
            for(int j=jobs[i][0];j>0;j--){
                if(result[j]==-1){
                    result[j] = i;
                    maxProfit += jobs[i][1];
                    break;
                }
            }
        }

        return maxProfit;
    }
}
