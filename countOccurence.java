import java.util.*;
public class Main
{
    static int occurenceCount(int[] arr, int x){
        int count = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == x){
                count ++;
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
	    int[] arr = {1,2,3,3,4};
		int x = 3;
		System.out.println("Count of Occurencnce : "+ occurenceCount(arr,x));

	}
}
