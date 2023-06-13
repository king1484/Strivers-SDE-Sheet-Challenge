import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int left = 0;
        int right = arr.size()-1;
        while(left<right){
            int mid = (left + right)/2;
            if(mid%2==1){
                mid--;
            }
            if(!arr.get(mid).equals(arr.get(mid+1))){
                right = mid;
            }else{
                left = mid + 2;
            }
        }

        return arr.get(left);
    }
}
