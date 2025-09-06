import java.util.*;
public class Main
{
    static int bruteMaximum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    
    static int optimizeMaximum(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        return maxi;
    }
	public static void main(String[] args) {
	    int[] arr = {8,1,7,5};
		System.out.println("Maximum value of the array by brute Force approach : " + bruteMaximum(arr));
		System.out.println("Maximum value of the array by optimize approach : " + optimizeMaximum(arr));
	}
}
