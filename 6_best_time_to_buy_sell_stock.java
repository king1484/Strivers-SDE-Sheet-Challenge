import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0;
        int maxProfit = 0;
        for(int i=0;i<prices.size();i++){
            if(buyPrice > prices.get(i)){
                buyPrice = prices.get(i);
            }
            sellPrice = prices.get(i) - buyPrice;
            maxProfit = Math.max(sellPrice, maxProfit);
        }
        return maxProfit;
    }
}
