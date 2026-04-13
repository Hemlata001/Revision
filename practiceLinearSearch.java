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
		
		
		// key
		System.out.print("Enter key : ");
		int key = sc.nextInt();
		
		//linear search
		for(int i = 0;i<arr.length;i++){
		    if(arr[i]== key){
		        System.out.println("The key is present at index "+ i);
		    }
		}
	}
}
