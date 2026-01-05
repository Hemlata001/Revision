// Find Element in an Array
import java.util.*;
public class findElement
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		arr[0] = 15;
		arr[1] = 30;
		arr[2] = 40;
		arr[3] = 4;
		arr[4] = 11;
		arr[5] = 9;

		System.out.println("Array");
		for(int i = 0;i<arr.length;i++){
		    System.out.print(arr[i] + " ");
		}
	    System.out.println("\nKey");
		int k = sc.nextInt();
		System.out.println("Find Element in an Array -> ");
		boolean found = false;
	
		for(int i = 0;i<arr.length;i++){
		    if(arr[i] == k){
		        System.out.println("The index is present at " + i + " position");
		        found = true;
                break;
		    }
		}
		if(!found){
            System.out.println("Element not present");
        }
	}
}
