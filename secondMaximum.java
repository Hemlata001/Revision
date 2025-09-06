
import java.util.*;
public class Main
{
    static int secondmax(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        int smaxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>smaxi && arr[i]<maxi){
                smaxi = arr[i];
            }
        }
        return smaxi;
    }
   
	public static void main(String[] args) {
	    int[] arr = {1,2,13,5,7,10};
	    System.out.println("maximum value : "+ secondmax(arr));

	}
}
