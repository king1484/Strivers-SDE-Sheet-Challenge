import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        long res = 1;
        long a = x;
        long b = n;
        while(b > 0){
            if(b%2!=0){
                res = (res%m * a%m)%m;
            }
            a = (a%m * a%m)%m;
            b = b / 2;
        }
        return (int)res;
    }
}
