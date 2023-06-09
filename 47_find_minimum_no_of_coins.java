import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int count = 0;
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        for (int i = coins.length - 1; i >= 0; i--) {
            while (coins[i] <= amount) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }
}
