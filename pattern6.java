// solid pyramid pattern
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int n = sc.nextInt();
		
		for(int rows = 1;rows<=n;rows++){
		    // spaces
		    for(int cols = 1;cols<=n-rows;cols++){
		        System.out.print("  ");
		    }
		    
		    // stars
		    for(int cols = 1;cols<=2*rows - 1;cols++){
		        System.out.print("* ");
		    }
		    System.out.println();
		   
		}
	
	}
}
