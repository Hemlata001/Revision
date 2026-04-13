// sum
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
		// total sum 
		int sum = 0;
		for(int val : arr){
		    sum += val;
		}
		System.out.println("Sum : " + sum);
	}
}
