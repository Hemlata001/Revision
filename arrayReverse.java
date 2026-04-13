import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// input
		for(int i = 0; i < arr.length; i++){
            System.out.print("Enter value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
		
		// print
		System.out.print("Array: ");
		for(int i = 0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
		// reverse
		int start = 0;
		int end = arr.length-1;
		while(start< end){
		    int temp = arr[start];
		    arr[start] = arr[end];
		    arr[end] = temp;
		    start++;
		    end--;
		}
		
        // print reversed array
		System.out.print("\nReversed array: ");
		for(int i = 0; i < arr.length; i++){
		    System.out.print(arr[i] + " ");
		}	
        		
    }
}
