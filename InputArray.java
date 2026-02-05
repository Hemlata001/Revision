import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		// Input in the Array
		for(int i = 0;i<arr.length;i++){
		    System.out.println("Enter "+(i+1)+"no. : ");
		    arr[i] = sc.nextInt();
		}
		System.out.println("Here is what you entered");
		for(int x: arr){
		    System.out.println(x);
		}
	}
}
