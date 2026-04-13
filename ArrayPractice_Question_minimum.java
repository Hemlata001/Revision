import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int arr[];
		arr = new int[n];
		// input
		for(int i = 0;i<arr.length;i++){
		    System.out.println("Provide input for index " + i);
		    arr[i] = sc.nextInt();
		}
		// minimum
		int minValue = arr[0];
		for(int i = 0;i<arr.length;i++){
		    if(arr[i]<minValue){
		        minValue = arr[i];
		    }
		}
		System.out.print("Minimum value : "+minValue);
	}
}
