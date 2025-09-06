import java.util.*;
public class Main
{
    static int smallestBrute(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    
    static int smallestOptimized(int[] arr){
        int mini = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(mini>arr[i]){
                mini = arr[i];
            }
        }
        return mini;
    }
   
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,0};
		System.out.println("Smallest number in an Array by bruteforce approach: "+ smallestBrute(arr));
		System.out.println("Smallest number in an Array by optimized approach: "+ smallestOptimized(arr));
		

	}
}
