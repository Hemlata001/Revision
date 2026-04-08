// print  counting from n to 1.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter n: ");
	    int n = sc.nextInt();
	    
	    for(int i = n;i>=1;i--){
	        System.out.println(i);
	    }
	}
}
