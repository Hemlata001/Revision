import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the key value : ");
	    int key = sc.nextInt();

		int[] arr = {2,4,6,8,10,12,14};
		int start = 0;
		int end = arr.length - 1;
		boolean found = false;

		while(start <= end){
		    int mid = (start + end) / 2;

		    if(key == arr[mid]){
		        System.out.println("Element found at index: " + mid);
		        found = true;
		        break;
		    }
		    else if(key > arr[mid]){
		        start = mid + 1;
		    } 
		    else{
		        end = mid - 1;
		    }
		}

		if(!found){
		    System.out.println("Element not found");
		}
	}
}
