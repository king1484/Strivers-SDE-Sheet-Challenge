import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
        Arrays.sort(items,new Comparator<Pair>(){
           public int compare(Pair i1, Pair i2) {
			   if(((i2.value/(double)i2.weight) - (i1.value/(double)i1.weight))>=0){
				   return 1;
			   }else{
				   return -1;
			   }
           }
        });
		double maxValue = 0;
		for(int i=0;i<items.length;i++){
			if(w>=items[i].weight){
				w -= items[i].weight
				maxValue += items[i].value;
			}else{
				maxValue += (items[i].value / (double) items[i].weight) * w;
				w = 0;
				break;
			}
		}
		return maxValue;
    }
}
