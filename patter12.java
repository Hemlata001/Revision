import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
	// PART A	
		for(int rows = 1;rows<=n;rows++){
		    // part 1
		    //spaces
		    for(int cols = 1;cols<=n-rows;cols++){
		        System.out.print("  ");
		    }
		    // part 2
		    if(rows==1){
		        for(int cols = 1;cols<= 2*rows-1;cols++){
		            System.out.print("* ");
		        }
		    }else{
		        //middleware
		        // 1 Star
		        System.out.print("* ");
		        // spaces
		        for(int cols = 1;cols<= 2*rows-3;cols++){
		            System.out.print("  ");
		        }
		        // 1 star
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
	// PART B
	    for(int rows = 1;rows<=n-1;rows++){
	        // spaces
	        //part1 
	        for(int cols = 1;cols<=rows;cols++){
	            System.out.print("  ");
	        }
	        // part2
	        if(rows==(n-1)){
	            System.out.print("* ");
	        }else{
	            // 1 star
	            System.out.print("* ");
	            // spaces = (2(n-r)-3)
	            for(int col = 1;col<= 2*(n-rows)-3;col++){
	                System.out.print("  ");
	            }
	            // 1 star
	            System.out.print("* ");
	        }
	        // move to next move
	        System.out.println();
	        
	        
	    }
	
	
	}
}
