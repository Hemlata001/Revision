// print your name 100 times
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter name: ");
	    String n = sc.nextLine();
	    
	    for(int i = 1;i<=100;i++){
	        System.out.println(n);
	    }
	}
}
