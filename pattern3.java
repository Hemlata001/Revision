// solid right-angle triangle pattern
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int n = sc.nextInt();
		// rows = stars
		for(int rows = 1;rows<=n;rows++){
		    for(int cols = 1;cols<=rows;cols++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
