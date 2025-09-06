import java.util.*;
public class Main
{
    static int[] threeSum(int[] arr, int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                   if(arr[i] + arr[j] + arr[k] == target){
                       return new int[]{i,j,k};
                    } 
                }
                
            }
        }
        return null;
    }
   
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,0};
	    int target = 9;
	    System.out.println("Three sum : "+ Arrays.toString(threeSum(arr,target)));
	
		

	}
}
