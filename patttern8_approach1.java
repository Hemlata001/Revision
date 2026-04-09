// hollow rectangle pattern
// approach 1
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int n = sc.nextInt();
		System.out.print("Enter cols : ");
		int m = sc.nextInt();
		
		for(int rows = 1;rows<=n;rows++){
		    for(int cols = 1;cols<=m;cols++){
		        if(rows==1||rows==n||cols==1||cols==m){
		            System.out.print("* ");
		        }else{
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	
	}
}
