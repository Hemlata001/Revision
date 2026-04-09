import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int n = sc.nextInt();
	
		
		for(int rows = 1;rows<=n;rows++){
		    
		    if(rows==1||rows == 2||rows==n){
		        for(int col = 1;col<=rows;col++){
		            System.out.print("* ");
		        }
		    }else{
		        //middle rows
		        //1*
		        System.out.print("* ");
		        //(row-2) spaces
		        for(int col = 1;col<=(rows-2);col++){
		            System.out.print("  ");
		        }
		        //1*
		        System.out.print("* ");
		        
		    }
		    System.out.println();
		}
		     
	
	}
}
