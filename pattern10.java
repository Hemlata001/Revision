import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int n = sc.nextInt();
	
		
		for(int rows = 1;rows<=n;rows++){
		    // part 1
		    // spaces
		    for(int cols = 1;cols<= n-rows;cols++){
		        System.out.print("  ");
		    }
		    //part 2
		    if(rows==1||rows==n){
		        for(int cols = 1;cols<=2*rows-1;cols++){
		            System.out.print("* ");
		        }
		    }else{
		        //middleware
		        // 1 Star
		        System.out.print("* ");
		        
		        //spaces = 2r-3
		        for(int cols = 1;cols<= 2*rows-3;cols++){
		            System.out.print("  ");
		        }
		        // 1 star
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
