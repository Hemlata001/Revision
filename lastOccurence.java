
import java.util.*;
public class Main
{
    static int lastOccurence(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == x){
                lastIndex  = i;
            }
        }
        return lastIndex;
    }
    
	public static void main(String[] args) {
	    int[] arr = {1,2,3,3,4};
		int x = 3;
		System.out.println("Last Occurencnce : "+ lastOccurence(arr,x));

	}
}
