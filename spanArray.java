// Span of an Array
import java.util.*;
public class spanArray
{
	public static void main(String[] args) {
		int[] arr = new int[7];
		arr[0] = 6;
		arr[1] = 15;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 4;
		arr[5] = 11;
		arr[6] = 9;
		System.out.println("Array");
		for(int i = 0;i<arr.length;i++){
		    System.out.print(arr[i] + " ");
		}
		System.out.println("\nThe Span of an Array");
		int maxi = Integer.MIN_VALUE;
		int mini = Integer.MAX_VALUE;
		
		for(int i = 0;i<arr.length;i++){
		    if(arr[i]>maxi){
		        maxi = arr[i];
		    }
		    if(arr[i]<mini){
		        mini = arr[i];
		    }
		}
		int span = maxi - mini;
		System.out.println(span);
	}
}
